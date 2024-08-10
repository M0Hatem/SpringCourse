package com.springcourse.springcourse.learnSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class LearnSpringBootLauncher {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootLauncher.class, args);
    }
}
