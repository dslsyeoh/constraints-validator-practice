package com.dsl.constraints.validator.repository;

import com.dsl.constraints.validator.domain.StorageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends JpaRepository<StorageEntity, Long>
{
    StorageEntity findByName(String name);
}
