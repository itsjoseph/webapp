package com.jlagp.springboot.webapp.controllers;

import com.jlagp.springboot.webapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Luis", "Amador");

        model.addAttribute("titulo", "Hola");
        model.addAttribute("nombre", user.getName());
        return "details";
    }
}
