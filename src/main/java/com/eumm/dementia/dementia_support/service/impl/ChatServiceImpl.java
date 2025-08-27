package com.eumm.dementia.dementia_support.service.impl;

import com.example.dementia.dto.request.ChatRequest;
import com.example.dementia.dto.response.ChatResponse;
import com.example.dementia.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    @Override
    public ChatResponse generateChat(ChatRequest request) {
        // TODO: Strategy 패턴 적용 (환자 상태별 질문 생성)
        String aiQuestion = "오늘은 어떤 추억이 떠오르시나요?";
        return new ChatResponse(aiQuestion, null, null,
                LocalDateTime.now().toString());
    }
}
