package com.springcourse.springcourse.examples.dPrePost;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private final SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("oi");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("done");
    }
}

@Configuration
@ComponentScan("com.springcourse.springcourse.examples.dPrePost")
public class PrePostAnnotationContextLauncherApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
