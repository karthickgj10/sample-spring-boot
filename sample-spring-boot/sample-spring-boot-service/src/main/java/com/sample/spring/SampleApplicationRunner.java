package com.sample.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sample.spring"})
@SpringBootApplication
public class SampleApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(SampleApplicationRunner.class, args);
    }
}