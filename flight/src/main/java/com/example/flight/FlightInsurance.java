package com.example.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FlightInsurance extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FlightInsurance.class);
	}

	
	public static void main(String[] args) {
		System.out.println("SpringBoot Application --- Start");
		SpringApplication.run(FlightInsurance.class, args);
		System.out.println("SpringBoot Application --- After");
	}

}
