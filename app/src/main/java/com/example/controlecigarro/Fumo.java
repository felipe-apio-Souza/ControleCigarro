package com.example.controlecigarro;

import java.util.Date;

public class Fumo {
    private Long id;
    private String emailUser;
    private String tipo;
    private Integer qtd;
    private Date date;

    public Fumo() {
    }

    public Fumo(Long id, String emailUser, String tipo, Integer qtd, Date date) {
        this.id = id;
        this.emailUser = emailUser;
        this.tipo = tipo;
        this.qtd = qtd;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
