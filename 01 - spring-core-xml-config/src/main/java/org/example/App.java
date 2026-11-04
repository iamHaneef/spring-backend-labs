package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args )

    {
        //we created the container now we need to how to get object automatically here

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        //get context by spring
        Student student = (Student) context.getBean("st1"); // called by if to get particular bean and access

        // System.out.println(student.getRno());
        // System.out.println(student.getAge());
        // student.show();

        student.writePen();

        //System.out.println( "Hello World!" );

        //as per normal java object calls
        //Student s = new Student();
        //s.show();
    }
}
