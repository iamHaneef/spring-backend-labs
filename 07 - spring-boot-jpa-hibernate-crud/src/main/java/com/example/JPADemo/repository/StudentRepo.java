package com.example.JPADemo.repository;

import com.example.JPADemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    //now we need to manually declare a method to find by Department

    //here department is automatically taken from the table field "tech"


    List<Student> findByDepartment(String department);

    //here gender is automatically taken from the table field "tech"

    List<Student> findByGender(String gender);

    //here gender is automatically taken from the table field "tech" and by gender too so native query

    @Query(value = "SELECT * FROM student WHERE gender = :gender AND department = :department",
            nativeQuery = true)
    List<Student> findByGenderAndDepartment(
            @Param("gender") String gender,
            @Param("department") String department
    );

}
