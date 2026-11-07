package com.example.JPADemo.service;

import com.example.JPADemo.model.Student;
import com.example.JPADemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    //Here we need to connect service with JPA repo

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentId(int id) {
        return studentRepo.findById(id).orElse(null);
    }

    public void addStudents(Student student) {
        studentRepo.save(student);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudentbyId(int id) {
        studentRepo.deleteById(id);
    }

    public void deleteStudents() {
        studentRepo.deleteAll();
    }


    public List<Student> getStudentsByDepartment(String department) {
        return studentRepo.findByDepartment(department);
    }

    public List<Student> getStudentsByGender(String gender) {
        return studentRepo.findByGender(gender);
    }

    public List<Student> getStudByGenderAndDepartment(String gender, String department) {
        return studentRepo.findByGenderAndDepartment(gender,department);
    }

    public List<Student> filterStudentsbyNameAndDepartment(String name, String department) {
        return studentRepo.findByNameAndDepartment(name,department);
    }
}
