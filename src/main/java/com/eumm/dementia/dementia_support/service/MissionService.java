package com.eumm.dementia.dementia_support.service;

import com.example.dementia.dto.request.MissionRequest;
import com.example.dementia.dto.response.MissionResponse;

import java.util.List;

public interface MissionService {
    MissionResponse assignMission(MissionRequest request);
    List<MissionResponse> getMissionsByUser(String userId);
    MissionResponse completeMission(String missionId);
}
