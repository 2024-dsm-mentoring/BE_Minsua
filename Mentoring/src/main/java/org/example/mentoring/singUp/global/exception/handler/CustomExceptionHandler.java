package org.example.mentoring.singUp.global.exception.handler;

import org.example.mentoring.singUp.global.exception.CustomException;
import org.example.mentoring.singUp.global.exception.error.ErrorResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ErrorResponseEntity> handleCustomException(CustomException customException) {
        return ErrorResponseEntity.responseEntity(customException.getErrorCode());
    }
}
