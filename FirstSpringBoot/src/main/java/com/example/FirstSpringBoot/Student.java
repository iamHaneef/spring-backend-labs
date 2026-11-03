package com.example.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Student {

    public Student()
    {
        System.out.println("Student constructor");
    }

    int age;

    //creating the interface object to handle all 3

    @Autowired
    @Qualifier("pencil")
    private Writer writer;

    // only Pen connect with Student when it Autowired
    //field injection
//    @Autowired
//    private Pen pen;



    //Setter Injection

//    @Autowired
//    public void setPen(Pen pen) {
//        this.pen = pen;
//    }

    //Constructor Injection

//    @Autowired
//    public Student(Pen pen) {
//        this.pen = pen;
//    }



    public void show(){
        System.out.println("Student show");
    }

    public void writeExam()
    {
        writer.write();
    }

}
