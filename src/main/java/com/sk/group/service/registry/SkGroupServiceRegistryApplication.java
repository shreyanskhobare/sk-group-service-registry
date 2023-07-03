package com.sk.group.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SkGroupServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkGroupServiceRegistryApplication.class, args);
	}

}
