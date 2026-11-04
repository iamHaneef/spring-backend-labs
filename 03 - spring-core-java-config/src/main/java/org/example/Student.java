package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {


    public Student() {
        System.out.println("Student constructor");
    }

    @Value("22") // it get the value from using this annotation
    private int rno; //0

//    //Field Injection
//    @Autowired
//    @Qualifier("pen")
    private Writer writer;  //null

    @Autowired
    public Student(@Qualifier("pen") Writer writer) {
        this.writer = writer;
    }


    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWriter() {
        return writer;
    }

    //Setter Injection

//    @Autowired
//    @Qualifier("pen")
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    //Constructor Injection


    public void writeExam()
    {
        writer.write();
    }

    public void show() {
        System.out.println("Student show");
    }

}
