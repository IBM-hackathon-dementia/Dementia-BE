package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.MediaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MediaRepository extends MongoRepository<MediaEntity, String> {
    List<MediaEntity> findByCategory(String category);
}
