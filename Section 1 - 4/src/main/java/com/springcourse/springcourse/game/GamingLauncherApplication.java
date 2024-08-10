package com.springcourse.springcourse.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;



@Configuration
@ComponentScan("com.springcourse.springcourse.game")
public class GamingLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingLauncherApplication.class)) {
        context.getBean(GameRunner.class).run();
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
