package com.eumm.dementia.dementia_support.service;

import com.example.dementia.dto.response.MemoryMapResponse;
import com.example.dementia.dto.response.ReactionResponse;
import com.example.dementia.entity.UserInfoEntity;

public interface UserService {
    UserInfoEntity getUserInfo(String userId);
    MemoryMapResponse getMemoryMap(String userId);
    ReactionResponse getLatestReaction(String userId);
}
