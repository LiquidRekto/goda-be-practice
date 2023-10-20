package com.goda.appbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.goda.appbe")
@EnableAutoConfiguration
public class GodaAppBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodaAppBeApplication.class, args);
	}

}
