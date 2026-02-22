package com.example.employee.controller;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public List<?> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody EmployeeEntity employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }


}
