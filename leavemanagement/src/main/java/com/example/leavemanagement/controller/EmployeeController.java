package com.example.leavemanagement.controller;


import com.example.leavemanagement.entity.EmployeeEntity;
import com.example.leavemanagement.service.EmployeeService;
import com.example.leavemanagement.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        ApiResponse response = new ApiResponse(
                true,
                "Employee fetched Successfully",
                HttpStatus.ACCEPTED.value(),
                employeeEntity
        );
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }
}
