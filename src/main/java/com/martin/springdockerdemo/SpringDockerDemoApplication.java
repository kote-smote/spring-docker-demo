package com.martin.springdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {

    private static long COUNTER = 0;

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World" + COUNTER++;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}
}
