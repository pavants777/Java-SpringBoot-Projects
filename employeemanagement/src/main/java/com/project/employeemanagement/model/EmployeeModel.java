package com.project.employeemanagement.model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    private String address;
    private Integer salary;

    @Column(name = "date_of_join")
    private Timestamp dateOfJoin;

    public EmployeeModel(){}

    //  Getter and Setter

    public Integer getId(){ return this.id;}

    public String getName(){ return this.name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return this.dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getAddress() { return this.address; }
    public void setAddress(String address) { this.address = address; }

    public Integer getSalary() { return this.salary; }
    public void setSalary(Integer salary) { this.salary = salary; }

    public Date getDateOfJoin() { return this.dateOfJoin; }
    public void setDateOfJoin(Timestamp dateOfJoin) { this.dateOfJoin = dateOfJoin;}
}
