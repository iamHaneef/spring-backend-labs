package com.example.StudentCRUD.Service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {


    public static List<Student> students = new ArrayList<>(Arrays.asList(new Student(1,"DOLU","CSE"),new Student(2,"BOLU","IT")));

    public static Student getStudentbyID(int id) {

        int index = 0;
        for(int i = 0 ; i < students.size() ; i++)
        {
            if(students.get(i).getId() == id)
            {
                index = i;
            }
        }

        return students.get(index);

    }



    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
