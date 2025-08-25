package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.ImageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ImageRepository extends MongoRepository<ImageEntity, String> {
    List<ImageEntity> findByUserId(String userId);
}