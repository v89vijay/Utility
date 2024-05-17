package com.java.kafka.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration("com.java.kafka.pack")
public class ServiceKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceKafkaConsumerApplication.class, args);
	}

}
