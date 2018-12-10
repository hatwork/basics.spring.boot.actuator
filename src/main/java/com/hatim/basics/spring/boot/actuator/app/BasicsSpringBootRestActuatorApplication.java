package com.hatim.basics.spring.boot.actuator.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.hatim.basics.spring.boot") 	
@EnableAutoConfiguration
public class BasicsSpringBootRestActuatorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BasicsSpringBootRestActuatorApplication.class, args);
	}
	
	
}
