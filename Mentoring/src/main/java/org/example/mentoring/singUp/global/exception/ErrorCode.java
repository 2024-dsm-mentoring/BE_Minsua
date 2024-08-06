package org.example.mentoring.singUp.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode{;
    private final Integer httpStatus;
    private final String message;
}
