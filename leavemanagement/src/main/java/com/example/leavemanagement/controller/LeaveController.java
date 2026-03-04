package com.example.leavemanagement.controller;

import com.example.leavemanagement.dto.LeaveRequest;
import com.example.leavemanagement.dto.LeaveResponse;
import com.example.leavemanagement.entity.EmployeeEntity;
import com.example.leavemanagement.entity.LeaveEntity;
import com.example.leavemanagement.service.EmployeeService;
import com.example.leavemanagement.service.LeaveService;
import com.example.leavemanagement.utils.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/leave")
public class LeaveController {

    @Autowired
    LeaveService leaveService;

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/{employeeId}")
    public ResponseEntity<ApiResponse<LeaveResponse>> createEmployeeLeave(@PathVariable Long employeeId, @Valid @RequestBody LeaveRequest leaveRequest){
        EmployeeEntity employee = employeeService.getEmployeeById(employeeId);
        LeaveEntity leaveEntity = leaveService.convertRequestToEntity(leaveRequest,employee);
        LeaveEntity savedEntity = leaveService.createEmployeeLeave(leaveEntity);
        LeaveResponse leaveResponse = leaveService.convertEntityToResponse(savedEntity);

        ApiResponse response = new ApiResponse(
                true,
                "Leave Request Created Succesfully",
                HttpStatus.ACCEPTED.value(),
                leaveResponse
        );
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }
}
