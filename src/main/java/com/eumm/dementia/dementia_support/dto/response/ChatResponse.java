package com.eumm.dementia.dementia_support.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatResponse {
    private String question;    // AI가 생성한 질문
    private String answer;      // 환자 답변 (옵션)
    private String emotion;     // 감정 분석 결과 (옵션)
    private String timestamp;
}