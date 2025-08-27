package com.eumm.dementia.dementia_support.controller;

import com.example.dementia.dto.request.MissionRequest;
import com.example.dementia.dto.response.MissionResponse;
import com.example.dementia.service.MissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
@RequiredArgsConstructor
public class MissionController {

    private final MissionService missionService;

    @PostMapping("/assign")
    public ResponseEntity<MissionResponse> assignMission(@RequestBody MissionRequest request) {
        return ResponseEntity.ok(missionService.assignMission(request));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<MissionResponse>> getMissionsByUser(@PathVariable String userId) {
        return ResponseEntity.ok(missionService.getMissionsByUser(userId));
    }

    @PostMapping("/{missionId}/complete")
    public ResponseEntity<MissionResponse> completeMission(@PathVariable String missionId) {
        return ResponseEntity.ok(missionService.completeMission(missionId));
    }
}
