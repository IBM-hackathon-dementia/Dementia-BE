package com.eumm.dementia.dementia_support.service.impl;

import com.example.dementia.dto.response.ReportResponse;
import com.example.dementia.entity.ChatReportEntity;
import com.example.dementia.repository.ChatReportRepository;
import com.example.dementia.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ChatReportRepository chatReportRepository;

    @Override
    public ReportResponse generateReport(String userId, String imageId) {
        ChatReportEntity report = ChatReportEntity.builder()
                .userId(userId)
                .imageId(imageId)
                .chatSummary("AI 대화 요약")
                .memo("보호자 메모")
                .reportDate(LocalDateTime.now())
                .build();

        chatReportRepository.save(report);

        return new ReportResponse(report.getUserId(), report.getChatSummary(),
                report.getMemo(), List.of("추억", "가족"),
                report.getReportDate().toString());
    }

    @Override
    public List<ReportResponse> getReportsByUser(String userId) {
        return chatReportRepository.findByUserId(userId).stream()
                .map(r -> new ReportResponse(r.getUserId(), r.getChatSummary(),
                        r.getMemo(), List.of("키워드"), r.getReportDate().toString()))
                .collect(Collectors.toList());
    }
}
