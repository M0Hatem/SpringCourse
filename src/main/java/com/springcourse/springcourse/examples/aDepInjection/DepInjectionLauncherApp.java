package com.springcourse.springcourse.examples.aDepInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class BusinessClass {

    Dependency1 dependency1;

    Dependency2 dependency2;

    @Autowired
    public BusinessClass(Dependency2 dependency2, Dependency1 dependency1) {
        this.dependency2 = dependency2;
        this.dependency1 = dependency1;
    }
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }


    @Override
    public String toString() {
        return "work with " + dependency1;
    }
}

@Component
class Dependency1 {
}

@Component
class Dependency2 {
}


@Configuration
@ComponentScan("com.springcourse.springcourse.examples.aDepInjection")
public class DepInjectionLauncherApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));

        }
    }
}
