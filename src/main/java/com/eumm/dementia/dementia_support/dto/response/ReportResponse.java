package com.eumm.dementia.dementia_support.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ReportResponse {
    private String userId;
    private String summary;       // 대화 요약
    private String memo;          // 보호자 메모
    private List<String> keywords; // 기억 지도 키워드
    private String reportDate;
}