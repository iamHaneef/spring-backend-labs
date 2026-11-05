package com.example.StudentCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Student {

    private int id;
    private String name;
    private String department;

}
