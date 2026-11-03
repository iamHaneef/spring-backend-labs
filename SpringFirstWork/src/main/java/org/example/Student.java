package org.example;

public class Student {



    private int age;
    private int rno;

    private Writer writer; // need to be wired by any reference

    public Student(int age, int rno, Writer writer) {
        this.age = age;
        this.rno = rno;
        this.writer = writer;
    }

    public Student() {

    }

    //for pen - getter method is optional
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    //for roll no
    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getRno() {
        return rno;
    }

    //for age
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }


    //show method

    public void show()
    {
        System.out.println("Show method implement");
    }

    public void writePen()
    {
        writer.write();
    }
}
