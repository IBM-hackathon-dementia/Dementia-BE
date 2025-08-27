package com.eumm.dementia.dementia_support.service;

import com.example.dementia.dto.request.ChatRequest;
import com.example.dementia.dto.response.ChatResponse;

public interface ChatService {
    ChatResponse generateChat(ChatRequest request);
}
