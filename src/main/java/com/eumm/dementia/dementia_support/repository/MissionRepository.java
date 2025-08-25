package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.MissionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MissionRepository extends MongoRepository<MissionEntity, String> {
    List<MissionEntity> findByUserId(String userId);
    List<MissionEntity> findByStatus(String status);
}