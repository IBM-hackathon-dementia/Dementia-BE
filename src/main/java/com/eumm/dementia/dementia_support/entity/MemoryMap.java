package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "memory_map")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemoryMap {
    @Id
    private String id;
    private String userId;
    private List<String> keywords;     // 인물, 장소, 사건, 감정 키워드
    private LocalDateTime lastUpdated;
}