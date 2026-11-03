package com.example.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {

		//like a config start we did in Spring Framework

		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);

		Student st = context.getBean(Student.class); // new Student() basically
//		st.show();
//		st.age = 100; // here we chnage the age for s ,not s1 object
//
//		Student st1 = context.getBean(Student.class);
//		st1.show();

		//check here for both objects age
		// due to singleton it print 100 : 100 but for prototype it print 100 : 0

//		System.out.println(st.age + " : " + st1.age);

		st.writeExam();

	}

}
