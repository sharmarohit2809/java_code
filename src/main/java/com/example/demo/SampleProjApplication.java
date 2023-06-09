package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjApplication.class, args);
	}
   
	@RequestMapping("/")
	public String printHello() {
		return "Hello";
	}
}
