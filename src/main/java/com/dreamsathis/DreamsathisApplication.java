package com.dreamsathis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DreamsathisApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DreamsathisApplication.class, args);
		
		System.err.println("::::::::::Welcome to Dreamsathi:::::::::::::::::");
	
	}

}
