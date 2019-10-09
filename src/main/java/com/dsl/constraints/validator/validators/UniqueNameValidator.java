package com.dsl.constraints.validator.validators;

import com.dsl.constraints.validator.dto.Storage;
import com.dsl.constraints.validator.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class UniqueNameValidator implements ConstraintValidator<UniqueName, Storage>
{
    @Autowired
    private StorageRepository storageRepository;

    @Override
    public boolean isValid(Storage storage, ConstraintValidatorContext constraintValidatorContext)
    {
        return Objects.isNull(storageRepository.findByName(storage.getName()));
    }
}
