package com.springcourse.springcourse.exercises.BusinessCalculationService;

import com.springcourse.springcourse.exercises.BusinessCalculationService.Services.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = "com.springcourse.springcourse.exercises.BusinessCalculationService")
public class SpringContextLauncher {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(SpringContextLauncher.class)){
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
