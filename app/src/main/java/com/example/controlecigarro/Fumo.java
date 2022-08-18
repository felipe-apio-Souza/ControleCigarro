package com.example.controlecigarro;

public class Fumo {
    private String emailUser;
    private Integer qtd;

    public Fumo() {
    }

    public Fumo(String emailUser, Integer qtd ) {
        this.emailUser = emailUser;
        this.qtd = qtd;

    }


    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    }

