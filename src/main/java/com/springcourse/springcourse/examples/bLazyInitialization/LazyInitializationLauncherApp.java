package com.springcourse.springcourse.examples.bLazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
}

@Component
@Lazy
class ClassB {
    private final ClassA classA;

    ClassB(ClassA classA) {
        this.classA = classA;
    }
}

@Configuration
@ComponentScan("com.springcourse.springcourse.examples.a0")
public class LazyInitializationLauncherApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
