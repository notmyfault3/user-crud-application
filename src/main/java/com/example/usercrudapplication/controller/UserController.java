package com.example.usercrudapplication.controller;

import com.example.usercrudapplication.model.User;
import com.example.usercrudapplication.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = {"/", ""})
    public String getUsers(Model model) {
        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/create-user")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/save")
    public String saveUser(@Valid @ModelAttribute("user") User user, Errors errors) {
        if (errors.hasErrors()) {
            return "user-form";
        }
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/update-details/{id}")
    public String updateUserDetails(@PathVariable("id") int id, Model model) {
        User updatedUser = userService.findUserById(id);
        model.addAttribute("user", updatedUser);
        return "user-form";
    }

    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUserById(id);
        return "redirect:/users";
    }
}
