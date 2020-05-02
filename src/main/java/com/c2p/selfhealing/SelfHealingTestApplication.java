package com.c2p.selfhealing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SelfHealingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfHealingTestApplication.class, args);
	}

	@RequestMapping("/get")
	public String getHello() {
		return "Hello!";
	}
	@Bean
	public CustomHealthIndicator getIndicator() {
		return new CustomHealthIndicator();
	}
}
