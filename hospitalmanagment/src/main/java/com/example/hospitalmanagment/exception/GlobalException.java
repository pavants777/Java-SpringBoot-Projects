package com.example.hospitalmanagment.exception;

import com.example.hospitalmanagment.config.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResourceNotFoundError.class)
    public ResponseEntity<ApiResponse> resourceNotFooundError(ResourceNotFoundError error){
        ApiResponse response = new ApiResponse(
                false,
                HttpStatus.NOT_FOUND.value(),
                error.getMessage(),
                null
        );
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse> methodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String,String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );

        ApiResponse response = new ApiResponse(
                false,
                HttpStatus.BAD_REQUEST.value(),
                "Validation Failed",
                null

        );

        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}
