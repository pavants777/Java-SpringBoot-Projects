package com.example.leavemanagement.exception;

import com.example.leavemanagement.utils.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundError.class)
    public ResponseEntity<ApiResponse> notFoundError(NotFoundError error){
        ApiResponse response = new ApiResponse(
                false,
                error.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                null
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
