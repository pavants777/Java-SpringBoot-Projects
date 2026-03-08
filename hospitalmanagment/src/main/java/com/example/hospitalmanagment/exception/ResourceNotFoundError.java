package com.example.hospitalmanagment.exception;

import lombok.Data;

@Data
public class ResourceNotFoundError extends RuntimeException{
    private String message;

    public ResourceNotFoundError(String message){
        super(message);
        this.message = message;
    }
}
