package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.ReactionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReactionRepository extends MongoRepository<ReactionEntity, String> {
    List<ReactionEntity> findByUserId(String userId);
    List<ReactionEntity> findByStimulusId(String stimulusId);
}
