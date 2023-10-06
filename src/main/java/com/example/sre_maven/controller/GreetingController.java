package com.example.sre_maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        Object obj = null;
        obj.hashCode();
        return "Hello World!";
    }
}
