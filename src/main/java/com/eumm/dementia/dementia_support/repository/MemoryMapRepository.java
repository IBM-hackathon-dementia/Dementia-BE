package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.MemoryMapEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MemoryMapRepository extends MongoRepository<MemoryMapEntity, String> {
    Optional<MemoryMapEntity> findByUserId(String userId);
}