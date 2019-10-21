package com.springboot.studentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.studentdemo")
public class StudentdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentdemoApplication.class, args);
	}

}
