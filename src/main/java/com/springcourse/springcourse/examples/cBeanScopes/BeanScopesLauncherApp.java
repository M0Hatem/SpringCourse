package com.springcourse.springcourse.examples.cBeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ProtoTypeClass {
}

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
class SingleToneTypeClass {
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(ProtoTypeClass.class));
            System.out.println(context.getBean(ProtoTypeClass.class));
            System.out.println("--------------");
            System.out.println(context.getBean(SingleToneTypeClass.class));
            System.out.println(context.getBean(SingleToneTypeClass.class));
        }

    }
}
