package com.example.configserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
public class ConfigServerDemoApplication {
	@Value("${mysecret}")
	String mysecret;

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerDemoApplication.class, args);
	}

	@RequestMapping("/")
    public String home() {    
        return "mysecret from config server is: " + mysecret;
    }
}