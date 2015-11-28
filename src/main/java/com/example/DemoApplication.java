package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class DemoApplication {

    public static void main(String[] args) throws Throwable{
        SpringApplication application = new SpringApplication(DemoApplication.class);
        application.setShowBanner(false);
        application.run(args);
    }
}
