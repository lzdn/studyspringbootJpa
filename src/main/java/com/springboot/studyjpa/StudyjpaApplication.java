package com.springboot.studyjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class StudyjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyjpaApplication.class, args);
	}
}
