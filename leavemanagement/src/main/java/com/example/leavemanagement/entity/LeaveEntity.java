package com.example.leavemanagement.entity;

import com.example.leavemanagement.entity.enumerated.EmployeeStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "EmployeeLeaves")
public class LeaveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;

    @NotBlank
    private String reason;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false )
    private EmployeeEntity employee;


    public void setId(Long id) { this.id = id; }
    public Long getId() { return this.id; }

    public void setStartDate(Date startDate){ this.startDate = startDate; }
    public Date getStartDate() { return this.startDate; }

    public void setEndDate(Date endDate) { this.endDate = endDate; }
    public Date getEndDate(){ return this.endDate; }

    public void setReason(String reason) { this.reason = reason; }
    public String getReason(){ return this.reason; }

    public void setStatus(EmployeeStatus status) { this.status = status; }
    public EmployeeStatus getStatus(){ return this.status; }

    public void setEmployee(EmployeeEntity employee) { this.employee = employee; }
    public EmployeeEntity getEmployee() { return this.employee; }

}



