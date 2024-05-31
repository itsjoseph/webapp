package com.jlagp.springboot.webapp.controllers;

import com.jlagp.springboot.webapp.models.dto.ParamDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDTO getParam(@RequestParam(required = false, defaultValue = "Gil") String message) {

        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMensaje(message);

        return paramDTO;
    }

    @GetMapping("/var")
    public ParamDTO var(@RequestParam(required = false, defaultValue = "asdf") String text, @RequestParam(required = false, defaultValue = "2") Integer code) {
        ParamDTO paramsDTO = new ParamDTO();
        paramsDTO.setMensaje(text);
        paramsDTO.setCode(code);
        return paramsDTO;

    }

    @GetMapping("/request")
    public ParamDTO request(HttpServletRequest request) {
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        ParamDTO paramsDTO = new ParamDTO();
        paramsDTO.setMensaje(request.getParameter("mensaje"));
        return paramsDTO;
    }
}
