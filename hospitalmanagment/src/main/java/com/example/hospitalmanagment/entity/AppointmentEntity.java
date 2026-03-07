package com.example.hospitalmanagment.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AppointmentEntity")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private Data date;

    @NotBlank
    private 
}
