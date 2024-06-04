package com.jlagp.springboot.webapp.controllers;

import com.jlagp.springboot.webapp.models.dto.ParamDTO;
import com.jlagp.springboot.webapp.models.dto.ParamMixDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {
    @Value("${config.username}")
    private String username;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @Value("${config.code}}")
    private String code;

    @GetMapping("/baz/{mensaje}")
    public ParamMixDTO baz(@PathVariable String mensaje) {
        ParamMixDTO paramDTO = new ParamMixDTO();
        paramDTO.setMensaje(mensaje);
        return paramDTO;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message) {
        Map<String, Object> model = new HashMap<>();
        model.put("username", username);
        model.put("message", message);
        model.put("listOfValues", listOfValues);
        model.put("code", code);
        return model;
    }
}
