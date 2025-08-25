package com.eumm.dementia.dementia_support.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ImageUploadRequest {
    private String userId;
    private String imageUrl;
    private String description;
    private LocalDateTime scheduledDate; // 회상 세션 예정일
}