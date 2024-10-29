package com.example.femalecrimestats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class FemalecrimestatsApplication {

	private CrimeService crimeService;
	public static void main(String[] args) {
		SpringApplication.run(FemalecrimestatsApplication.class, args);
	}
	
}
