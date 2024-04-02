package com.ktga.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoProjectApplication.class, args);
		
		student st = context.getBean(student.class);
		st.call();
	}

}
