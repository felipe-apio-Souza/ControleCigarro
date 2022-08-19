package com.example.controlecigarro;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Vape extends Fumo{


    public Vape(String emailUser, Integer qtd) {
        super(emailUser, qtd);
    }

    public Vape() {

    }


    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Vape").child(super.getEmailUser()).setValue(this);
    }

}
