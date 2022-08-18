package com.example.controlecigarro;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Charuto extends Fumo {


    public Charuto() {
    }

    public Charuto(String emailUser, Integer qtd) {
        super(emailUser, qtd);
    }


    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Charuto").child(super.getEmailUser()).setValue(this);
    }
}
