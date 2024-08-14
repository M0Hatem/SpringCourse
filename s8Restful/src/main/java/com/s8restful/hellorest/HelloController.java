package com.s8restful.hellorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello rest";
    }

    @GetMapping("/helloBean")
    public HelloBean helloBean() {
        return new HelloBean("hello");
    }
}
