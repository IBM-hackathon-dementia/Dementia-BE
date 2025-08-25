package com.eumm.dementia.dementia_support.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReactionResponse {
    private String stimulusId;
    private double reactionScore;
    private String emotion;
    private LocalDateTime createdAt;
}