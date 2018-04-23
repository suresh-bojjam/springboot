package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
@ComponentScan(value= {"com.example.controllers",
		"com.example.models"
		})
public class SpringBeanScopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanScopesApplication.class, args);
	}
}
