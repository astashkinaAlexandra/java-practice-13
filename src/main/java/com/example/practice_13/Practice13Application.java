package com.example.practice_13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class Practice13Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice13Application.class, args);
    }
}
