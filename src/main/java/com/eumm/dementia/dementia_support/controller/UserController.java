package com.eumm.dementia.dementia_support.controller;

import com.example.dementia.dto.response.MemoryMapResponse;
import com.example.dementia.dto.response.ReactionResponse;
import com.example.dementia.entity.UserInfoEntity;
import com.example.dementia.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}/info")
    public ResponseEntity<UserInfoEntity> getUserInfo(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getUserInfo(userId));
    }

    @GetMapping("/{userId}/memory-map")
    public ResponseEntity<MemoryMapResponse> getMemoryMap(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getMemoryMap(userId));
    }

    @GetMapping("/{userId}/reaction")
    public ResponseEntity<ReactionResponse> getLatestReaction(@PathVariable String userId) {
        return ResponseEntity.ok(userService.getLatestReaction(userId));
    }
}
