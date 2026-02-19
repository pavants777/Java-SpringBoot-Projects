package com.project.studentmanagement.service;

import com.project.studentmanagement.entity.StudentEntity;
import com.project.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }

    public StudentEntity addNewStudent(StudentEntity student){
        return studentRepository.save(student);
    }

    public StudentEntity getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }


}
