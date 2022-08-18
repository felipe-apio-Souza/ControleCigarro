package com.example.controlecigarro;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Cachimbo extends Fumo{



    public Cachimbo() {
    }

    public Cachimbo(String emailUser, Integer qtd) {
        super(emailUser, qtd);
    }


    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Cachimbo").child(super.getEmailUser()).setValue(this);
    }

}
