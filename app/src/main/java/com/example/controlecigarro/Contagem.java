package com.example.controlecigarro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Contagem extends AppCompatActivity {
    TextView fumo;
    Integer i = 0;
    Boolean t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contagem);
        getSupportActionBar().hide();
        fumo = findViewById(R.id.fumo);

        if(Inicial.i == 1){
            fumo.setText("cigarro");
        }else if(Inicial.i == 2){
            fumo.setText("charuto");
        }else if(Inicial.i == 3){
            fumo.setText("vape");
        }else if(Inicial.i == 4){
            fumo.setText("narguile");
        }else if(Inicial.i == 5){
            fumo.setText("cachimbo");
        }
    }

    public void cigarro(){

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Cigarro");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    String l = MainActivity.usuario.getEmail();
                    if(d.getValue(Cigarro.class).getEmailUser().equals(l)){
                        i = d.getValue(Cigarro.class).getQtd();
                        i++;
                        Cigarro cigarro = new Cigarro(l, i);
                        cigarro.salvar();
                        t = true;
                        break;
                    }else{
                        t = false;
                    }
                }
                if(t = false){
                    Cigarro cigarro = new Cigarro(MainActivity.usuario.getEmail(), i);
                    cigarro.salvar();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

    public void charuto(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Charuto");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    String l = MainActivity.usuario.getEmail();
                    if(d.getValue(Charuto.class).getEmailUser().equals(l)){
                        i = d.getValue(Charuto.class).getQtd();
                        i++;
                        Charuto charuto = new Charuto(l, i);
                        charuto.salvar();
                        t = true;
                        break;
                    }else{
                        t = false;
                    }
                }
                if(t = false){
                    Charuto charuto = new Charuto(MainActivity.usuario.getEmail(), i);
                    charuto.salvar();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

    public void vape(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Vape");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    String l = MainActivity.usuario.getEmail();
                    if(d.getValue(Vape.class).getEmailUser().equals(l)){
                        i = d.getValue(Vape.class).getQtd();
                        i++;
                        Vape vape = new Vape(l, i);
                        vape.salvar();
                        t = true;
                        break;
                    }else{
                        t = false;
                    }
                }
                if(t = false){
                    Vape vape = new Vape(MainActivity.usuario.getEmail(), i);
                    vape.salvar();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

    public void narguile(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Narguile");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    String l = MainActivity.usuario.getEmail();
                    if(d.getValue(Narguile.class).getEmailUser().equals(l)){
                        i = d.getValue(Narguile.class).getQtd();
                        i++;
                        Narguile narguile = new Narguile(l, i);
                        narguile.salvar();
                        t = true;
                        break;
                    }else{
                        t = false;
                    }
                }
                if(t = false){
                    Narguile narguile = new Narguile(MainActivity.usuario.getEmail(), i);
                    narguile.salvar();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }

    public void cachimbo(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Cachimbo");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    String l = MainActivity.usuario.getEmail();
                    if(d.getValue(Cachimbo.class).getEmailUser().equals(l)){
                        i = d.getValue(Cachimbo.class).getQtd();
                        i++;
                        Cachimbo cachimbo = new Cachimbo(l, i);
                        cachimbo.salvar();
                        t = true;
                        break;
                    }else{
                        t = false;
                    }
                }
                if(t = false){
                    Cachimbo cachimbo = new Cachimbo(MainActivity.usuario.getEmail(), i);
                    cachimbo.salvar();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    public void botao(View view){
        if(Inicial.i == 1){
            cigarro();
        }else if(Inicial.i == 2){
            charuto();
        }else if(Inicial.i == 3){
            vape();
        }else if(Inicial.i == 4){
            narguile();
        }else if(Inicial.i == 5){
            cachimbo();
        }
    }
}