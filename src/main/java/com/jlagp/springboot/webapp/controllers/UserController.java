package com.jlagp.springboot.webapp.controllers;

import com.jlagp.springboot.webapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Luis", "Amador");
        user.setEmail("luis@gmail.com");
        model.addAttribute("titulo", "Hola");
        model.addAttribute("nombre", user.getName());
        model.addAttribute("email", user.getEmail());
        return "details";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<User> users = Arrays.asList(new User("user1", "user"),
                                         new User("user2", "user", "yserver@gmail.com"),
                                         new User("user3", "user", "yserver@gmail.com"));
        model.addAttribute("users", users);
        model.addAttribute("title",  "Estado usuarios");
        return "list";
    }
}
