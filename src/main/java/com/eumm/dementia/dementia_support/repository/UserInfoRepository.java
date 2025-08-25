package com.eumm.dementia.dementia_support.repository;

import com.example.dementia.entity.UserInfoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserInfoRepository extends MongoRepository<UserInfoEntity, String> {
    Optional<UserInfoEntity> findByUserId(String userId);
}