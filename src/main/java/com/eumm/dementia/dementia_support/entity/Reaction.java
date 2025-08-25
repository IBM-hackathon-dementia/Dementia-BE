package com.eumm.dementia.dementia_support.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "reactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reaction {
    @Id
    private String id;
    private String userId;
    private String stimulusId;      // 자극(이미지/영상/질문) ID
    private double reactionScore;   // 반응 점수 (0~1)
    private String emotion;         // 감정 (행복, 슬픔 등)
    private LocalDateTime createdAt;
}