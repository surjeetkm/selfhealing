package com.c2p.selfhealing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SelfHealingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfHealingTestApplication.class, args);
	}

	@Bean
	public CustomHealthIndicator getIndicator() {
		return new CustomHealthIndicator();
	}
}
