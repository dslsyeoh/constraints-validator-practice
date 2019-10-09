package com.dsl.constraints.validator.controllers;

import com.dsl.constraints.validator.domain.StorageEntity;
import com.dsl.constraints.validator.dto.Storage;
import com.dsl.constraints.validator.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/storage")
public class StorageController
{
    @Autowired
    private StorageService storageService;

    @PostMapping
    public StorageEntity create(@RequestBody Storage storage)
    {
        return storageService.create(storage);
    }

    @PutMapping
    public StorageEntity update(@RequestBody Storage storage)
    {
        return storageService.update(storage);
    }
}
