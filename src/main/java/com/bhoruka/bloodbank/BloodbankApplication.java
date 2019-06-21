package com.bhoruka.bloodbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodbankApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(BloodbankApplication.class);
		application.run(args);
	}
}
