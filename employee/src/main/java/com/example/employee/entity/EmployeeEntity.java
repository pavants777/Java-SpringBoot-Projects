package com.example.employee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    private String address;
    private Integer salary;
    @Column(name = "date_of_join")
    private Timestamp dateOfJoin;


    public EmployeeEntity(){}

    // Getter and Setters

    public Integer getId(){ return this.id ;}

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return this.dateOfBirth; }
    public void setDateOfBirth(Date date) { this.dateOfBirth = date;}

    public String getAddress() { return this.address ; }
    public void setAddress(String address) { this.address = address ;}

    public Integer getSalary() { return this.salary; }
    public void setSalary(Integer salary) { this.salary = salary; }

    public Timestamp getDateOfJoin() { return this.dateOfJoin; }
    public void setDateOfJoin(Timestamp date) { this.dateOfJoin = date; }

}


//-- create table employee (
//-- 	id bigint not null auto_increment,
//--     name varchar(20),
//--     date_of_birth date,
//--     address varchar(100),
//--     Salary int,
//        --     date_of_join timestamp,
//--     primary key(id)
//-- );