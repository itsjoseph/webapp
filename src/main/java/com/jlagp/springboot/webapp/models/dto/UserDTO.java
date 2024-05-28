package com.jlagp.springboot.webapp.models.dto;

import com.jlagp.springboot.webapp.models.User;

public class UserDTO {
    private User user;
    private String titulo;

    public UserDTO() {
    }

    public UserDTO(User user, String titulo) {
        this.user = user;
        this.titulo = titulo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
