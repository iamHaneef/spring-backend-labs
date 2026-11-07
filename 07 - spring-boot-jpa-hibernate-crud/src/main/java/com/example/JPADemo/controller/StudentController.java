package com.example.JPADemo.controller;

import com.example.JPADemo.model.Student;
import com.example.JPADemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

    //Now we plan to proceed with Declared method by us
    //try to get student data by department

    @GetMapping("students/department/{depart}")
    public List<Student> getStudentsByTechnology(@PathVariable("depart") String department) {
        return studentService.getStudentsByDepartment(department);
    }

    //try to get student data by gender

    @GetMapping("students/gender/{gender}")
    public List<Student> getStudentsByGender(@PathVariable("gender") String gender) {
        return studentService.getStudentsByGender(gender);
    }

    //we can also bring the native query combinations in spring by sql
    //try to get student data by gender and Department

    @PostMapping("students/filter")
    public List<Student> filterStudents(
            @Param("gender") String gender,
            @Param("department") String department) {

        return studentService.getStudByGenderAndDepartment(
                gender, department);
    }

    //try to get student data by name and department
    @GetMapping("students/filters")
    public List<Student> filterStudentsbyNameAndDepartment(
            @Param("name") String name,
            @Param("department") String department) {
        return studentService.filterStudentsbyNameAndDepartment(name,department);
    }


}
