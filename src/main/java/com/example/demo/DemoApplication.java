package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hotfix change1 at change 3");
		System.out.println("hotfix change2");
		SpringApplication.run(DemoApplication.class, args);
	}
}
