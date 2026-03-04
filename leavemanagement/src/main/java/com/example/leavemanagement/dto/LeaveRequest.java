package com.example.leavemanagement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class LeaveRequest {
    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;

    @NotBlank
    private String reason;


    public void setStartDate(Date startDate){ this.startDate = startDate; }
    public Date getStartDate() { return this.startDate; }

    public void setEndDate(Date endDate) { this.endDate = endDate; }
    public Date getEndDate(){ return this.endDate; }

    public void setReason(String reason) { this.reason = reason; }
    public String getReason(){ return this.reason; }
}



//startDate
//endDate
// reason
//employee (ManyToOne relationship)