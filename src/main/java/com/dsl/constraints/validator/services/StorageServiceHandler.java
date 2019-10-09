package com.dsl.constraints.validator.services;

import com.dsl.constraints.validator.domain.StorageEntity;
import com.dsl.constraints.validator.dto.Storage;
import com.dsl.constraints.validator.repository.StorageRepository;
import com.dsl.constraints.validator.validators.CreateValidation;
import com.dsl.constraints.validator.validators.UpdateValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.Set;

@Service
public class StorageServiceHandler implements StorageService
{
    @Autowired
    private StorageRepository storageRepository;

    @Autowired
    private Validator validator;

    @Override
    public StorageEntity create(Storage storage)
    {
        Set<ConstraintViolation<Storage>> errors = validator.validate(storage, Default.class, CreateValidation.class);
        if(!errors.isEmpty()) throw new RuntimeException(errors.toString());
        StorageEntity storageEntity = new StorageEntity();
        storageEntity.setName(storage.getName());
        storageEntity.setQuantity(storage.getQuantity());

        storageRepository.save(storageEntity);

        return storageEntity;
    }

    @Override
    public StorageEntity update(Storage storage)
    {
        Set<ConstraintViolation<Storage>> errors = validator.validate(storage, Default.class, UpdateValidation.class);
        if(!errors.isEmpty()) throw new RuntimeException(errors.toString());

        StorageEntity storageEntity = storageRepository.findById(storage.getId()).get();
        storageEntity.setName(storage.getName());
        storageEntity.setQuantity(storage.getQuantity());
        storageRepository.save(storageEntity);

        return storageEntity;
    }
}
