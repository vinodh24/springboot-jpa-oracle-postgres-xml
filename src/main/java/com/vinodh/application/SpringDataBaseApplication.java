package com.vinodh.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vinodh.*")
public class SpringDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataBaseApplication.class, args);
	}

}
