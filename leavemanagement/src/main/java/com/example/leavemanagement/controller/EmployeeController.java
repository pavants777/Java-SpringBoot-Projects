package com.example.leavemanagement.controller;


import com.example.leavemanagement.dto.EmployeeRequest;
import com.example.leavemanagement.dto.EmployeeResponse;
import com.example.leavemanagement.entity.EmployeeEntity;
import com.example.leavemanagement.service.EmployeeService;
import com.example.leavemanagement.utils.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<ApiResponse<List<EmployeeEntity>>> getEmployees(){
        ApiResponse<List<EmployeeEntity>> response = new ApiResponse<>(
                true,
                "All Employees are fetched",
                HttpStatus.ACCEPTED.value(),
                employeeService.getAllEmployees()
        );
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<EmployeeEntity>> getEmployeeById(@PathVariable Long id){
        EmployeeEntity employeeEntity = employeeService.getEmployeeById(id);
        EmployeeResponse employeeResponse = employeeService.convertEntityToResponse(employeeEntity);
        ApiResponse response = new ApiResponse(
                true,
                "Employee fetched Successfully",
                HttpStatus.ACCEPTED.value(),
                employeeResponse
        );
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }

    @PostMapping("/")
    public ResponseEntity<ApiResponse<EmployeeResponse>> createNewEmployee(@Valid @RequestBody EmployeeRequest employeeRequest){
        EmployeeEntity employeeEntity = employeeService.convertRequestToEntity(employeeRequest);
        EmployeeEntity savedEmployee = employeeService.createNewEmployee(employeeEntity);
        EmployeeResponse employeeResponse = employeeService.convertEntityToResponse(savedEmployee);
        ApiResponse response  = new ApiResponse(
                true,
                "Employee Created Succesfully",
                HttpStatus.ACCEPTED.value(),
                employeeResponse
        );
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }



}
