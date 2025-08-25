package com.eumm.dementia.dementia_support.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class MissionResponse {
    private String mission;
    private String status;         // ASSIGNED / DONE
    private LocalDateTime completedAt;
}