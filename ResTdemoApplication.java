package com.hcc.example.RESTdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ResTdemoApplication {
	
	public static void extracted(ConfigurableApplicationContext context) throws IOException {
		
		StudentController studentController = context.getBean(StudentController.class);
		System.out.println(" students " + studentContoller.readData());
	}

	public static void main(String[] args) {
		SpringApplication.run(ResTdemoApplication.class, args);
	}
	
	

}
