package com.example.controlecigarro;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Narguile extends Fumo{




    public Narguile() {
    }

    public Narguile(String emailUser, Integer qtd) {
        super(emailUser, qtd);
    }



    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Charuto").child(super.getEmailUser()).setValue(this);
    }
}
