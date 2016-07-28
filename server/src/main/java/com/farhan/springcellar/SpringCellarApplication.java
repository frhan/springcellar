package com.farhan.springcellar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class SpringCellarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCellarApplication.class, args);
	}
}
