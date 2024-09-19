package com.s8restful.hellorest;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    private MessageSource messageSource;

    public HelloController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello rest";
    }


    @GetMapping("/helloBean")
    public HelloBean helloBean() {
        return new HelloBean("hello");
    }

    @GetMapping("/helloBean/{name}")
    public HelloBean helloBeanParam(@PathVariable String name) {
        return new HelloBean("hello " + name);
    }

    @GetMapping("/hello-i18n")
    public String helloInternationalized() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "default", locale);
//        return "hello rest V2";
    }
}
