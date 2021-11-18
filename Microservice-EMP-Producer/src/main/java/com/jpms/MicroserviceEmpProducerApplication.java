package com.jpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jpms.*"})
public class MicroserviceEmpProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEmpProducerApplication.class, args);
	}

}
