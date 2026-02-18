package com.project.studentmanagement.controller;

import com.project.studentmanagement.entity.StudentEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.project.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/AddNewStudent")
    public StudentEntity addNewStudent(@RequestBody StudentEntity student){
        return studentService.addNewStudent(student);
    }
}
