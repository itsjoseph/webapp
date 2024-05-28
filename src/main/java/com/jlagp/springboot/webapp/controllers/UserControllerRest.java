package com.jlagp.springboot.webapp.controllers;

import com.jlagp.springboot.webapp.models.dto.UserDTO;
import com.jlagp.springboot.webapp.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserControllerRest {

    @GetMapping("/details2")
    public Map<String, Object> details() {
        User user = new User("Luis", "Amador");

        Map<String, Object> model = new HashMap<>();

        model.put("titulo", "Hola");
        model.put("nombre", user);
        return model;
    }

    @GetMapping("/details-dto")
    public UserDTO detailsdto() {
        User user = new User("Luis","Amador");
        UserDTO userDTO = new UserDTO();
        userDTO.setUser(user);
        userDTO.setTitulo("Bienveni");
        Map<String, Object> model = new HashMap<>();

        model.put("titulo", "Hola");
        model.put("nombre", user);
        return userDTO;
    }
}
