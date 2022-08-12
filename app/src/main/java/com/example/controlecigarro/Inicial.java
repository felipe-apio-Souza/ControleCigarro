package com.example.controlecigarro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inicial extends AppCompatActivity {
    Button charuto,cigarro,vape,narguile,cachimbo;
    static int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        getSupportActionBar().hide();
        cigarro=findViewById(R.id.cigarro);
        charuto=findViewById(R.id.charuto);
        vape=findViewById(R.id.vape);
        narguile = findViewById(R.id.narguile);
        cachimbo=findViewById(R.id.cachimbo);

    }

    public void cigarro(View view){
        i = 1;
        Intent i = new Intent(this, Contagem.class);
        startActivity(i);
    }

    public void charuto(View view){
        i = 2;
        Intent i = new Intent(this, Contagem.class);
        startActivity(i);
    }

    public void vape(View view){
        i = 3;
        Intent i = new Intent(this, Contagem.class);
        startActivity(i);
    }

    public void narguile(View view){
        i = 4;
        Intent i = new Intent(this, Contagem.class);
        startActivity(i);
    }

    public void cachimbo(View view){
        i = 5;
        Intent i = new Intent(this, Contagem.class);
        startActivity(i);
    }

}