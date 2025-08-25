package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "user_images")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image {
    @Id
    private String id;
    private String userId;
    private String imageUrl;
    private String description;
    private LocalDateTime uploadDate;
    private LocalDateTime scheduledDate;
}