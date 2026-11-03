package org.example.config;

//this is handle the entire bean management like inject , create , manage everything

//import org.example.Pencil;
//import org.example.Pen;
//import org.example.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.example.Writer;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class MyConfiguration {

//    @Bean
//    public Student student(@Qualifier("pen") Writer writer) {
//        Student st = new Student();
//        st.setRno(30);
//        st.setWriter(writer);
//        return st;
//    }
//
//    @Bean @Primary
//    public Pen pen()
//    {
//        return new Pen();
//    }
//
//    @Bean @Primary
//    public Pencil pencil()
//    {
//        return new Pencil();
//    }


}
