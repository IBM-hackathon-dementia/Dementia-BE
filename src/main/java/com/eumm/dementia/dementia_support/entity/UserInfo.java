package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "user_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo {
    @Id
    private String id;
    private String userId;            // UserEntity 참조
    private String name;
    private int age;
    private String dementiaLevel;     // 경증 / 중증
    private String triggerElements;   // 주요 기억 트리거 요소
    private LocalDateTime createdAt;
}