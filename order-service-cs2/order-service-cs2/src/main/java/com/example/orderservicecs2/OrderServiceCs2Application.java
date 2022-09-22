package com.example.orderservicecs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceCs2Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceCs2Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){return new RestTemplate();}
}
