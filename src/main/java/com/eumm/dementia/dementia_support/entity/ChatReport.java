package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;

@Document(collection = "chat_reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatReport {
    @Id
    private String id;
    private String userId;
    private String imageId;
    private String chatSummary;
    private String memo;
    private LocalDateTime reportDate;
}
