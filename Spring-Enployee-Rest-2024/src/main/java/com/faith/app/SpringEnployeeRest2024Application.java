package com.faith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//entry point of our spring boot application

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
//this annotation is applied to the class to indicate 
//that it is the main class for a spring boot application
//and triggers the auto configuration process
public class SpringEnployeeRest2024Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEnployeeRest2024Application.class, args);
		System.out.println("Welcome to spring boot Application");
		
		
	}

}
