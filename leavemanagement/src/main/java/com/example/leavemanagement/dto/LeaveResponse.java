package com.example.leavemanagement.dto;

import com.example.leavemanagement.entity.enumerated.EmployeeStatus;

import java.util.Date;

public class LeaveResponse {
    private Long id;
    private Date startDate;
    private Date endDate;
    private EmployeeStatus status;

    public void setId(Long id) { this.id = id; }
    public Long getId() { return this.id; }

    public void setStartDate(Date startDate){ this.startDate = startDate; }
    public Date getStartDate() { return this.startDate; }

    public void setEndDate(Date endDate) { this.endDate = endDate; }
    public Date getEndDate(){ return this.endDate; }

    public void setStatus(EmployeeStatus status) { this.status = status; }
    public EmployeeStatus getStatus(){ return this.status; }
}
