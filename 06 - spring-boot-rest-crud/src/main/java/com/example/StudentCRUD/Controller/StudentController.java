package com.example.StudentCRUD.Controller;

import com.example.StudentCRUD.Service.StudentService;
import com.example.StudentCRUD.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    //Controller Layer

    //to get all students
    @GetMapping("students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    //to get particular student ?
    @GetMapping("students/{rno}")
    public Student getStudentById(@PathVariable("rno") int id) {
        return StudentService.getStudentbyID(id);
    }

    //Here we Add one new Student

    @PostMapping("students")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }



}
