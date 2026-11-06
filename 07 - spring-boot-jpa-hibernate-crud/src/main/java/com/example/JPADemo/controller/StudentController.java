package com.example.JPADemo.controller;

import com.example.JPADemo.model.Student;
import com.example.JPADemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //we going to run the crud operations by JPA Hibernate

    //Get all the Students

    @GetMapping("students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    //Get Particular Students

    @GetMapping("students/{id}")
    public Student getStudentsbyId(@PathVariable int id) {
        return studentService.getStudentId(id);
    }

    //create new Students

    @PostMapping("students")
    public String getStudentId(@RequestBody Student student) {
        studentService.addStudents(student);
        return "success";
    }

    //update the existing student data

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "update success";
    }

    //delete the student entries by id

    @DeleteMapping("students/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudentbyId(id);
        return "delete success";
    }

    //delete all students entries

    @DeleteMapping("students")
    public String deleteAllStudents() {
        studentService.deleteStudents();
        return "delete all success";
    }


}
