package com.example.GETPOST.service;

import com.example.GETPOST.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> studentList = new ArrayList<>(Arrays.asList(new Student(1, "John", "Python"), new Student(2, "Jane", "Java") , new Student(3, "Doe", "Java")));

    public List<Student> getAllStudent() {
        return studentList;
    }

    public void addStudent(int id, String name, String technology) {
        studentList.add(new Student(id,name,technology));
    }
}
