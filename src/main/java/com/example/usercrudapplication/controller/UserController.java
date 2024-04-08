package com.example.usercrudapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping(value = {"/", ""})
    public String getUsers() {
        return "home";
    }

    @GetMapping("/user")
    public String createUser() {
        return "user-form";
    }
}
