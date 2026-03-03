package com.example.ems1.controller;

import com.example.ems1.dto.EmployeeRequestDto;
import com.example.ems1.dto.EmployeeResponseDto;
import com.example.ems1.entity.EmployeeEntity;
import com.example.ems1.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/")
    public EmployeeResponseDto createNewEmployee(@Valid @RequestBody EmployeeRequestDto employee){
         EmployeeEntity employeeEntity = employeeService.convertToEntity(employee);
         EmployeeEntity savedEmployee = employeeService.createNewEmployee(employeeEntity);
         return employeeService.convertToResponse(savedEmployee);
    }

    @GetMapping("/{id}")
    public EmployeeResponseDto getEmployeeById(@PathVariable Long id){
       EmployeeEntity employeeEntity = employeeService.getEmployeeById(id);
       return employeeService.convertToResponse(employeeEntity);
    }

}
