package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello, World!</h1>";
    }

    @GetMapping("/bye")
    public String bye() {
        return "<h1>Goodbye, World!</h1>";
    }
}
