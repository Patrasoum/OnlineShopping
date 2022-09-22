package com.example.productservicecs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceCs2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceCs2Application.class, args);
	}

}
