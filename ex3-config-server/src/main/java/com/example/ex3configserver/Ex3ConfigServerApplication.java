package com.example.ex3configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ex3ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex3ConfigServerApplication.class, args);
	}
}
