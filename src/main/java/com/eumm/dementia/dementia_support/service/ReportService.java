package com.eumm.dementia.dementia_support.service;

import com.example.dementia.dto.response.ReportResponse;

import java.util.List;

public interface ReportService {
    ReportResponse generateReport(String userId, String imageId);
    List<ReportResponse> getReportsByUser(String userId);
}
