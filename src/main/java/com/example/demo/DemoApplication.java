package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("mater change1 at github web");
		System.out.println("hotfix change1 master");
		System.out.println("hotfix change2");
        System.out.println("master change4");
		SpringApplication.run(DemoApplication.class, args);
	}
}
