package com.example.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.auth", "com.example.shared"})
public class AuthServiceSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceSpringBootApplication.class);
    }

}
