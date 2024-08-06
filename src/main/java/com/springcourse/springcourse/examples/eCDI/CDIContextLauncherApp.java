package com.springcourse.springcourse.examples.eCDI;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessService {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    //    @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

}

@Component
class DataService {
}

@Configuration
@ComponentScan("com.springcourse.springcourse.examples.eCDI")
public class CDIContextLauncherApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
