package com.springcourse.springcourse.helloConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring {
    public static void main(String[] args) {
        try( var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class)) {

            System.out.println(context.getBean("name"));
//        System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("person2"));
        }

    }
}
