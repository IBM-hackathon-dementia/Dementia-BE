package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.FallbackImageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FallbackImageRepository extends MongoRepository<FallbackImageEntity, String> {
    List<FallbackImageEntity> findByCategory(String category);
}