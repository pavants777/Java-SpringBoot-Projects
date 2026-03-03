package com.example.leavemanagement.service;

import com.example.leavemanagement.entity.EmployeeEntity;
import com.example.leavemanagement.exception.NotFoundError;
import com.example.leavemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(()-> new NotFoundError("Employee Doesn't Exiits with this Id"));
    }
}
