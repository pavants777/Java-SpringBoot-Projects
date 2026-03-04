package com.example.leavemanagement.dto;

public class EmployeeResponse {
    private Long id;
    private String email;
    private String name;
    private String department;

    public EmployeeResponse(){}

    public void setId(Long id) { this.id = id; }
    public Long getId() { return this.id; }

    public void setName(String name) { this.name = name;}
    public String getName() { return this.name; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }

    public void setDepartment(String department) { this.department = department;}
    public String getDepartment() { return this.department; }
}
