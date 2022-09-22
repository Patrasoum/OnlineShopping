package com.example.serviceregistrycs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryCs2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryCs2Application.class, args);
	}

}
