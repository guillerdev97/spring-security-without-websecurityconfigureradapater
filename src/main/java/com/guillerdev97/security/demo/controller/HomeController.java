package com.guillerdev97.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    // open
    @GetMapping
    public String welcome() {
        return "Hello world";
    }

    // close - only for user role
    @GetMapping("/user")
    public String welcomeToUser() {
        return "Hello user";
    }

    // close - only for admin role
    @GetMapping("/admin")
    public String welcomeToAdmin() {
        return "Hello admin";
    }
}
