package org.example.mentoring.singUp.global.exception.error;

import lombok.Builder;
import lombok.Getter;
import org.example.mentoring.singUp.global.exception.ErrorCode;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Getter
@Builder
public class ErrorResponseEntity {

    private int status;
    private String code;
    private String message;
    private LocalDateTime createLocalDataTime;

    public static ResponseEntity<ErrorResponseEntity> responseEntity(ErrorCode errorCode) {
        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(ErrorResponseEntity.builder()
                        .status(errorCode.getHttpStatus())
                        .code(errorCode.getMessage())
                        .code(errorCode.name())
                        .createLocalDataTime(LocalDateTime.now())
                        .build()
                );
    };

}
