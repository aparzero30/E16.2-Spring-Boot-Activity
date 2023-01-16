package com.example.studentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@Configuration
@EntityScan(basePackages = "com.example.studentdemo")
@EnableJpaRepositories(basePackages = "com.example.studentdemo")
public class StudentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdemoApplication.class, args);
	}

}
