package com.example.leavemanagement.dto;

public class EmployeeRequest {
    private String name;
    private String email;
    private String department;

    public EmployeeRequest(){}

    public String getName() { return this.name; }
    public void setName(String name){ this.name = name; }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return this.department; }
    public void setDepartment(String department) {
        this.department = department;
    }
}
