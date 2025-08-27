package com.eumm.dementia.dementia_support.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자를 찾을 수 없습니다."),
    INVALID_TOKEN("유효하지 않은 토큰입니다."),
    ACCESS_DENIED("접근이 거부되었습니다.");

    private final String message;
}