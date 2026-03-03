package com.example.leavemanagement.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ApiResponse<T> {
    private boolean success;
    private String message;
    private int status;
    private T data;
    private LocalDateTime localDate;

    public ApiResponse(boolean success,String message,int status,T data){
        this.success = success;
        this.message = message;
        this.status = status;
        this.data = data;
        this.localDate = LocalDateTime.now();;
    }

    // Getter and Setters for this Class

    public void setSuccess(boolean success) {
        this.success = success;
    }
    public boolean getSuccess() { return this.success; }

    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){ return this.message; }

    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){ return this.status; }

    public void setData(T data){
        this.data = data;
    }
    public T getData() { return this.data; }
    public LocalDateTime getLocalDate(){ return this.localDate; }
}
