package com.eumm.dementia.dementia_support.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.dementia.repository")
public class MongoConfig {
    // 추가 설정이 필요하면 여기에 정의
}
