package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.ChatReportEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatReportRepository extends MongoRepository<ChatReportEntity, String> {
    List<ChatReportEntity> findByUserId(String userId);
    List<ChatReportEntity> findByImageId(String imageId);
}
