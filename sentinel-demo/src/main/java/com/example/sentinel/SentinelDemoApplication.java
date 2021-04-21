package com.example.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SentinelDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelDemoApplication.class, args);
    }
}
