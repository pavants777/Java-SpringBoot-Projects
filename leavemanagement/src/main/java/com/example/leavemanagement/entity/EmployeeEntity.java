package com.example.leavemanagement.entity;

import com.example.leavemanagement.entity.enumerated.Department;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "EmployeeManagement")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    @Column(unique = true, nullable = true )
    private String email;

    @Enumerated(EnumType.STRING)
    private Department department;
}
