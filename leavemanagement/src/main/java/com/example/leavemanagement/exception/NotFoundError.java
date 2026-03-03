package com.example.leavemanagement.exception;

public class NotFoundError extends RuntimeException {
    private String message;
    public NotFoundError(String message){
        super(message);
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}

