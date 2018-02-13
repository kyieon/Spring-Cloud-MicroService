package com.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiServiceApplication {

    public static void main(String[] args) {
		SpringApplication.run(ApiServiceApplication.class, args);
	}
}