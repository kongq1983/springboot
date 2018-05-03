package com.kq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.kq.springboot"})
@SpringBootApplication
public class SpringBootConfiguration {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfiguration.class, args);
	}

}
