package com.example.demoOperaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoOperacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOperacionesApplication.class, args);
	}

}
