package com.debayan.learning1.springboottutorial1.startingpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.debayan.learning1.springboottutorial1.controllers", "com.debayan.learning1.springboottutorial1.services"})
public class CourseApp {

	public static void main(String[] args) {

		SpringApplication.run(CourseApp.class, args);
	}

}
