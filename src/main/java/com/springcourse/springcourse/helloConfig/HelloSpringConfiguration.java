package com.springcourse.springcourse.helloConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age){}

@Configuration
public class HelloSpringConfiguration {
    @Bean
    public String name(){
     return "mohamed";
    }
    @Bean
    public int age(){
        return 20;
    }
    @Bean(name = "newPersonName")
    public Person person(){
        return new Person("hatem",21);
    }
    @Bean
    public Person person2(String name, int age){
        return new Person(name,age);
    }
}
