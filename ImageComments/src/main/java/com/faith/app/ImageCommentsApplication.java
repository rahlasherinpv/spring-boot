package com.faith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class ImageCommentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageCommentsApplication.class, args);
		System.out.println("Welcome to spring boot Application");
	}

}
