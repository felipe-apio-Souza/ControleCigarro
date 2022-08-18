package com.example.controlecigarro;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Cigarro extends Fumo {


    public Cigarro() {
    }

    public Cigarro(String emailUser, Integer qtd) {
        super(emailUser, qtd);
    }

    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Cigarro").child(super.getEmailUser()).setValue(this);
    }
}
