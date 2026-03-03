package com.example.ems1.dto;

import com.example.ems1.entity.enums.EmployeeStatus;

import java.time.LocalDate;

public class EmployeeRequestDto {
    private String name;
    private String email;
    private String phoneNumber;
    private String department;
    private Double salary;
    private LocalDate hireDate;
    private EmployeeStatus status;


    public void setName(String name){ this.name = name; }
    public String getName(){ return this.name; }

    public void setEmail(String email) { this.email = email ; }
    public String getEmail() { return this.email; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber ;}
    public String getPhoneNumber(){ return this.phoneNumber; }

    public void setSalary(Double salary){ this.salary = salary; }
    public Double getSalary(){ return this.salary; }

    public void setDepartment(String departement){ this.department = departement;}
    public String getDepartment(){ return this.department; }

    public void setHireDate(LocalDate hireDate){ this.hireDate = hireDate; }
    public LocalDate getHireDate(){ return this.hireDate; }

    public void setStatus(EmployeeStatus status){ this.status = status; }
    public EmployeeStatus getStatus(){ return this.status; }
}
