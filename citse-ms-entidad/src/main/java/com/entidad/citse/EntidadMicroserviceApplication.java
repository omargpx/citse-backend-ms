package com.entidad.citse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EntidadMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntidadMicroserviceApplication.class, args);
	}

}
