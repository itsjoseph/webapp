package com.jlagp.springboot.webapp.controllers;

import com.jlagp.springboot.webapp.models.dto.UserDTO;
import com.jlagp.springboot.webapp.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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

    @GetMapping("/listado")
    public List<User> listado() {
        User user = new User("user1", "user");
        User user2 = new User("user2", "user");
        User user3 = new User("user3", "user");

        List<User> listad = Arrays.asList(user3, user2, user);
/*
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
*/
        return listad;
    }

    @GetMapping("/details-dto")
    public UserDTO detailsdto() {
        User user = new User("Luis", "Amador");
        UserDTO userDTO = new UserDTO();
        userDTO.setUser(user);
        userDTO.setTitulo("Bienveni");
        Map<String, Object> model = new HashMap<>();

        model.put("titulo", "Hola");
        model.put("nombre", user);
        return userDTO;
    }
}
