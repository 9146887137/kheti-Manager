package com.selfmade.e_Kheti_Manager;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EKhetiManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EKhetiManagerApplication.class, args);
	}

}
