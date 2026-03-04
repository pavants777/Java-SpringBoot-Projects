package com.example.leavemanagement.service;

import com.example.leavemanagement.dto.EmployeeRequest;
import com.example.leavemanagement.dto.EmployeeResponse;
import com.example.leavemanagement.entity.EmployeeEntity;
import com.example.leavemanagement.entity.enumerated.Department;
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

    public EmployeeEntity convertRequestToEntity(EmployeeRequest employeeRequest){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employeeRequest.getName());
        employeeEntity.setEmail(employeeRequest.getEmail());
        employeeEntity.setDepartment(Department.valueOf(employeeRequest.getDepartment()));
        return employeeEntity;
    }

    public EmployeeResponse convertEntityToResponse(EmployeeEntity employeeEntity){
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(employeeEntity.getId());
        employeeResponse.setName(employeeEntity.getName());
        employeeResponse.setEmail(employeeEntity.getEmail());
        employeeResponse.setDepartment(employeeEntity.getDepartment().name());
        return employeeResponse;
    }

    public EmployeeEntity getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(()-> new NotFoundError("Employee Doesn't Exiits with this Id"));
    }

    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }
}
