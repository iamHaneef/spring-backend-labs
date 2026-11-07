package com.example.GETPOST.controller;

import com.example.GETPOST.model.Student;
import com.example.GETPOST.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//To hanlde the cors error - to connect frontend with backend

@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //Get all student data
    @GetMapping("students")
    public List<Student> getStudent()
    {
        return studentService.getAllStudent();
    }

    //now try to create the user data by frontend

    @PostMapping("students/add")
    public void addStudent(@RequestParam int id, @RequestParam String name, @RequestParam String technology)
    {
        studentService.addStudent(id,name,technology);
    }


}
