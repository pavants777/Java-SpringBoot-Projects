package com.example.ems1.service;

import com.example.ems1.dto.EmployeeRequestDto;
import com.example.ems1.dto.EmployeeResponseDto;
import com.example.ems1.entity.EmployeeEntity;
import com.example.ems1.exception.ResourceNotFoundException;
import com.example.ems1.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class EmployeeService {
     private EmployeeRepository employeeRepository;

     public EmployeeService(EmployeeRepository employeeRepository){
         this.employeeRepository = employeeRepository;
     }

    public EmployeeEntity convertToEntity(EmployeeRequestDto dto) {
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail(dto.getEmail());
        emp.setName(dto.getName());
        emp.setPhoneNumber(dto.getPhoneNumber());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        emp.setHireDate(dto.getHireDate());
        emp.setStatus(dto.getStatus());
        return emp;
    }

    public EmployeeResponseDto convertToResponse(EmployeeEntity emp) {
        EmployeeResponseDto dto = new EmployeeResponseDto();
        dto.setId(emp.getId());
        dto.setName(emp.getName());
        dto.setEmail(emp.getEmail());
        dto.setDepartment(emp.getDepartment());
        dto.setSalary(emp.getSalary());
        return dto;
    }

     public EmployeeEntity createNewEmployee(EmployeeEntity employee){
         return employeeRepository.save(employee);
     }

    public EmployeeEntity getEmployeeById(Long id) {
         return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not Found user"));
    }
}
