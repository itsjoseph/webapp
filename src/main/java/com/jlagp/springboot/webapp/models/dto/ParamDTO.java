package com.jlagp.springboot.webapp.models.dto;

public class ParamDTO {
    private String mensaje;
    private int code;


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
