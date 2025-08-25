package com.eumm.dementia.dementia_support.dto.request;

import lombok.Data;

@Data
public class MissionRequest {
    private String userId;
    private String mission;      // 과제 텍스트
}