package com.eumm.dementia.dementia_support.dto.request;

import lombok.Data;

@Data
public class ChatRequest {
    private String userId;
    private String imageId;       // 어떤 이미지와 연결된 대화인지
    private String question;      // 보호자가 추가 질문을 직접 넣을 경우
}