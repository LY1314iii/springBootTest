package com.example.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot";
    }


    @GetMapping ("/hello2")
    public String hello2() {
        return "hello spring boot";
    }
}
