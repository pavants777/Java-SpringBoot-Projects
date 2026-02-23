package com.example.employee.service;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    public List<?> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public String addEmployee(EmployeeEntity employee) {

        employeeRepository.save(employee);
        return "Employee Created !";
    }

    public Optional<EmployeeEntity> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }
}
