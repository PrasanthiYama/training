package com.jpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.jpms.*"})
public class MicroserviceEmpProducerCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEmpProducerCloudApplication.class, args);
	}

}
