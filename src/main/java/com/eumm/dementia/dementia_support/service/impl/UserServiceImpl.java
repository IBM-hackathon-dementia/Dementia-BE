package com.eumm.dementia.dementia_support.service.impl;

import com.example.dementia.dto.response.MemoryMapResponse;
import com.example.dementia.dto.response.ReactionResponse;
import com.example.dementia.entity.UserInfoEntity;
import com.example.dementia.repository.UserInfoRepository;
import com.example.dementia.repository.MemoryMapRepository;
import com.example.dementia.repository.ReactionRepository;
import com.example.dementia.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserInfoRepository userInfoRepository;
    private final MemoryMapRepository memoryMapRepository;
    private final ReactionRepository reactionRepository;

    @Override
    public UserInfoEntity getUserInfo(String userId) {
        return userInfoRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("User info not found"));
    }

    @Override
    public MemoryMapResponse getMemoryMap(String userId) {
        var map = memoryMapRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Memory map not found"));
        return new MemoryMapResponse(map.getUserId(), map.getKeywords(), map.getLastUpdated());
    }

    @Override
    public ReactionResponse getLatestReaction(String userId) {
        var reactions = reactionRepository.findByUserId(userId);
        if (reactions.isEmpty()) throw new RuntimeException("No reactions found");

        var latest = reactions.get(reactions.size() - 1);
        return new ReactionResponse(latest.getStimulusId(), latest.getReactionScore(),
                latest.getEmotion(), latest.getCreatedAt());
    }
}
