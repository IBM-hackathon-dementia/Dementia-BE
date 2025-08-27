package com.eumm.dementia.dementia_support.controller;

import com.example.dementia.dto.response.ReportResponse;
import com.example.dementia.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @PostMapping("/generate")
    public ResponseEntity<ReportResponse> generateReport(@RequestParam String userId,
                                                         @RequestParam String imageId) {
        return ResponseEntity.ok(reportService.generateReport(userId, imageId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ReportResponse>> getReportsByUser(@PathVariable String userId) {
        return ResponseEntity.ok(reportService.getReportsByUser(userId));
    }
}
