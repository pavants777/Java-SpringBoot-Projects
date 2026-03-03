package com.example.ems1.dto;

public class EmployeeResponseDto {
    private Long id;
    private String name;
    private String email;
    private String department;
    private Double salary;

    public void setId(Long id) {this.id = id; }
    public Long getId(){ return this.id; }

    public String getName(){ return this.name;}
    public void setName(String name) { this.name = name; }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }

    public String getDepartment() { return this.department; }
    public void setDepartment(String department){ this.department = department;}

    public Double getSalary(){ return this.salary; }
    public void setSalary(Double salary){ this.salary = salary; }
}
