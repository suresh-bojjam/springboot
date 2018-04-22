package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan({"com.example.models",
	"com.example.controllers",
	"com.example.config"})
@ImportResource("classpath:app-config.xml")
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}
}
