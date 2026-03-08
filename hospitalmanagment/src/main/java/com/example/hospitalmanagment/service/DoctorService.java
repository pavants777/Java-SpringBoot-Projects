package com.example.hospitalmanagment.service;

import com.example.hospitalmanagment.entity.DoctorEntity;
import com.example.hospitalmanagment.exception.ResourceNotFoundError;
import com.example.hospitalmanagment.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public DoctorEntity createNewDoctor(DoctorEntity doctor){
        return doctorRepository.save(doctor);
    }

    public List<DoctorEntity> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public DoctorEntity getDoctorById(Long id){
        return doctorRepository.findById(id).orElseThrow(()-> new ResourceNotFoundError("Doctor not found "));
    }

    public void deleteDoctoryById(Long id){
        DoctorEntity doctor = doctorRepository.findById(id).orElseThrow(()->new ResourceNotFoundError("Doctor not Fond"));

        doctorRepository.delete(doctor);
    }
}
