package com.eumm.dementia.dementia_support.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class MemoryMapResponse {
    private String userId;
    private List<String> keywords;
    private LocalDateTime lastUpdated;
}