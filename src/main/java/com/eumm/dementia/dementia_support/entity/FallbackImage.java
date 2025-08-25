package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fallback_images")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FallbackImage {
    @Id
    private String id;
    private String imageUrl;
    private String title;
    private String category;        // 풍경, 가전, 광고 등
    private String description;
    private String userId;
}
