package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "media_library")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Media {
    @Id
    private String id;
    private String category;      // 운동, 음악, 명상 등
    private String title;
    private String url;           // 유튜브 링크
    private LocalDateTime addedAt;
}