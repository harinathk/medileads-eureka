package com.medileads.spring.cloud.ms.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MedileadsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedileadsEurekaApplication.class, args);
	}
}
