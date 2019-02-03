package com.example.swaggerexample.controller;

import com.example.swaggerexample.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("John", 10),
                new User("Peter", 12)
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName) {
        return new User(userName, 5);
    }



}
