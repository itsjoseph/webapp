package com.jlagp.springboot.webapp.controllers;

import com.jlagp.springboot.webapp.models.dto.ParamDTO;
import com.jlagp.springboot.webapp.models.dto.ParamMixDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{mensaje}")
    public ParamMixDTO baz(@PathVariable String mensaje) {
        ParamMixDTO paramDTO = new ParamMixDTO();
        paramDTO.setMensaje(mensaje);
        return paramDTO;
    }

}
