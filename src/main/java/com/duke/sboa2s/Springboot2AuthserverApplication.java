package com.duke.sboa2s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
public class Springboot2AuthserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2AuthserverApplication.class, args);
	}
}
