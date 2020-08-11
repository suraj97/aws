package com.example.Flightdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Flightdetails {

	public static void main(String[] args) {
		System.out.println("Before:::::::::::::::");
		SpringApplication.run(Flightdetails.class, args);
		System.out.println("After:::::::::::::::");
	}

}
