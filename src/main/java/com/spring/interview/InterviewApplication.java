package com.spring.interview;

import com.spring.interview.custom.annotation.MainApp;
import org.springframework.boot.SpringApplication;


// @MainApp is custom annotation created on top of @SpringBootApplication
// @SpringBootApplication is worked on top of @Configuration , @ComponentScan , @EnableAutoConfiguration
@MainApp
public class InterviewApplication {
	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}
}
