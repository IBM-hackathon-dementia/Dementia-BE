package com.eumm.dementia.dementia_support.controller;

import com.example.dementia.dto.request.ChatRequest;
import com.example.dementia.dto.response.ChatResponse;
import com.example.dementia.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/start")
    public ResponseEntity<ChatResponse> startChat(@RequestBody ChatRequest request) {
        return ResponseEntity.ok(chatService.generateChat(request));
    }
}
