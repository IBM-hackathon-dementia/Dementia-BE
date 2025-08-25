package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // MongoDB 컬렉션명
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private String id;                // MongoDB ObjectId
    private String username;          // 로그인 아이디
    private String password;          // 암호 (추후 BCrypt 해시 필요)
    private String role;              // USER / CAREGIVER / ADMIN
    private LocalDateTime createdAt;
}