package com.example.demo;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		Files.createDirectories(Path.of("storage"));

		SpringApplication.run(DemoApplication.class, args);
	}

}