package com.example.controlecigarro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Contagem extends AppCompatActivity {
    TextView fumo;
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



}