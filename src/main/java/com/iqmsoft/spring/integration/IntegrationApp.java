package com.iqmsoft.spring.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.iqmsoft.spring.integration.shop")
class IntegrationApp {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApp.class, args);
    }
}
