package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "missions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mission {
    @Id
    private String id;
    private String userId;
    private String mission;        // 과제 내용
    private String status;         // ASSIGNED / DONE / FAILED
    private LocalDateTime assignedAt;
    private LocalDateTime completedAt;
}