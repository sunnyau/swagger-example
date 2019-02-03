package com.example.swaggerexample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @GetMapping
    public String getHello() {
        return "Hello World";
    }

    @PostMapping("/post")
    public String postHello(@RequestBody final String hello) {
        return hello;
    }

    @PutMapping("/put")
    public String putHello(@RequestBody final String hello) {
        return hello;
    }
}
