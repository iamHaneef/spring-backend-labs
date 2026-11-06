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
        boolean found = false;
        for(int i = 0 ; i < students.size() ; i++)
        {
            if(students.get(i).getId() == id)
            {
                index = i;
                found = true;
                break;
            }
        }

        if(!found) return new Student(0 , "" , "");

        else{
            return students.get(index);
        }
    }



    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String updateStudent(Student student) {

        int index = 0;
        boolean found = false;
        for(int i = 0 ; i < students.size() ; i++)
        {
            if(students.get(i).getId() == student.getId())
            {
                index = i;
                found = true;
                break;
            }
        }
        if(!found) return "The ID is Invalid";

        else{
            students.set(index , student);
            return "Updation is Successful";
        }
    }

    public String deleteStudent(int id) {

        int index = 0;
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == id)
            {
                index = i;
                found = true;
                break;
            }
        }
        if(!found) return "The Requested ID is invalid";

        else{
            students.remove(index);
            return "The Data is Deleted";
        }

    }
}
