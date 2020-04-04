package com.pjtreact.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pjtreact")
@EnableAutoConfiguration
public class PjtreactApplication {

	public static void main(String[] args) {
		SpringApplication.run(PjtreactApplication.class, args);
	}

}
