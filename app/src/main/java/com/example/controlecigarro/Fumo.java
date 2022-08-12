package com.example.controlecigarro;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class Fumo {
    private String emailUser;
    private String tipo;
    private Integer qtd;
    private Date date;

    public Fumo() {
    }

    public Fumo(String emailUser, String tipo, Integer qtd, Date date) {
        this.emailUser = emailUser;
        this.tipo = tipo;
        this.qtd = qtd;
        this.date = date;
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

    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Fumo").child(emailUser).setValue(this);
    }
}
