package com.project.employeemanagement.repository;

import com.project.employeemanagement.model.EmployeeModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel,Integer> {
}
