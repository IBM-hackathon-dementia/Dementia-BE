package com.eumm.dementia.dementia_support.service.impl;

import com.example.dementia.dto.request.MissionRequest;
import com.example.dementia.dto.response.MissionResponse;
import com.example.dementia.entity.MissionEntity;
import com.example.dementia.repository.MissionRepository;
import com.example.dementia.service.MissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MissionServiceImpl implements MissionService {

    private final MissionRepository missionRepository;

    @Override
    public MissionResponse assignMission(MissionRequest request) {
        MissionEntity mission = MissionEntity.builder()
                .userId(request.getUserId())
                .mission(request.getMission())
                .status("ASSIGNED")
                .assignedAt(LocalDateTime.now())
                .build();
        missionRepository.save(mission);

        return new MissionResponse(mission.getMission(), mission.getStatus(), null);
    }

    @Override
    public List<MissionResponse> getMissionsByUser(String userId) {
        return missionRepository.findByUserId(userId).stream()
                .map(m -> new MissionResponse(m.getMission(), m.getStatus(), m.getCompletedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public MissionResponse completeMission(String missionId) {
        MissionEntity mission = missionRepository.findById(missionId)
                .orElseThrow(() -> new RuntimeException("Mission not found"));
        mission.setStatus("DONE");
        mission.setCompletedAt(LocalDateTime.now());
        missionRepository.save(mission);

        return new MissionResponse(mission.getMission(), mission.getStatus(), mission.getCompletedAt());
    }
}
