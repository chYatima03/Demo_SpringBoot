package com.example.Demo2.demo2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/login")
    public String Login() {
        return "Hi This is Login page";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}