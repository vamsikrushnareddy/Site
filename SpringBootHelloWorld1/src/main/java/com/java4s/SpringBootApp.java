package com.java4s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {
	public static void main(String[] args) {
		System.out.println("B4 run()................!");
		SpringApplication.run(SpringBootApp.class, args);
		System.out.println("After run()..........!");
	}
}
