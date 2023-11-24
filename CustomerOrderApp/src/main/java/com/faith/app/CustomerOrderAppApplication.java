package com.faith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//entry point of our spring boot application

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
//this annotation is applied to the class to indicate 
//that it is the main class for a spring boot application
//and triggers the auto configuration process
public class CustomerOrderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrderAppApplication.class, args);
		System.out.println("Welcome to spring boot Application");
	}

}
