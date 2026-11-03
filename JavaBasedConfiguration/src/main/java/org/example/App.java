package org.example;

import org.example.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //inject the spring method like in Java - not xml
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

//        Student s = (Student) context.getBean("student"); // option 1 to inject the class by call by class


        //call by name of student object or by bean name

        Student s = context.getBean(Student.class);
        s.show();
        System.out.println(s.getRno());
        s.writeExam();
    }
}
