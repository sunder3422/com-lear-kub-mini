package com.learn.kub.mini;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Application deployed in minikube is running...");
        return "Hello from Spring Boot!";
    }

}