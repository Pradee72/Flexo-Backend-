package com.server.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FlexoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlexoServerApplication.class, args);
	}

}
