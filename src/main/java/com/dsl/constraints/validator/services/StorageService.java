package com.dsl.constraints.validator.services;

import com.dsl.constraints.validator.domain.StorageEntity;
import com.dsl.constraints.validator.dto.Storage;

public interface StorageService
{
    StorageEntity create(Storage storage);

    StorageEntity update(Storage storage);
}
