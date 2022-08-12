package com.example.controlecigarro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Inicial extends AppCompatActivity {
    Button charuto,cigarro,vape,narguilé,cachimbo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        getSupportActionBar().hide();
        cigarro=findViewById(R.id.cigarro);
        charuto=findViewById(R.id.charuto);
        vape=findViewById(R.id.vape);
        narguilé=findViewById(R.id.narguile);
        cachimbo=findViewById(R.id.cachimbo);

    }
}