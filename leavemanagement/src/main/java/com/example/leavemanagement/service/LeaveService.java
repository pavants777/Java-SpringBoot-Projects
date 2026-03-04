package com.example.leavemanagement.service;

import com.example.leavemanagement.dto.LeaveRequest;
import com.example.leavemanagement.dto.LeaveResponse;
import com.example.leavemanagement.entity.EmployeeEntity;
import com.example.leavemanagement.entity.LeaveEntity;
import com.example.leavemanagement.entity.enumerated.EmployeeStatus;
import com.example.leavemanagement.repository.LeaveRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveService {

    @Autowired
    public LeaveRepository leaveRepository;


    public LeaveEntity convertRequestToEntity(LeaveRequest leaveRequest, EmployeeEntity employee) {
        LeaveEntity leaveEntity = new LeaveEntity();
        leaveEntity.setStartDate(leaveRequest.getStartDate());
        leaveEntity.setEndDate(leaveRequest.getEndDate());
        leaveEntity.setReason(leaveRequest.getReason());
        leaveEntity.setStatus(EmployeeStatus.PENDING);
        leaveEntity.setEmployee(employee);
        return leaveEntity;
    }

    public LeaveResponse convertEntityToResponse(LeaveEntity leaveEntity){
        LeaveResponse leaveResponse = new LeaveResponse();
        leaveResponse.setId(leaveEntity.getId());
        leaveResponse.setStartDate(leaveEntity.getStartDate());
        leaveResponse.setEndDate(leaveEntity.getEndDate());
        leaveResponse.setStatus(leaveEntity.getStatus());
        return leaveResponse;
    }

    public LeaveEntity createEmployeeLeave(LeaveEntity leaveEntity) {
        return leaveRepository.save(leaveEntity);
    }
}
