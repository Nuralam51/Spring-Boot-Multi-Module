package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.shared", "com.example.student"})
public class StudentServiceSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceSpringBootApplication.class);
    }

}
