package com.example.controlecigarro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Registrar extends AppCompatActivity {
    EditText email, senha, senhaConfirm;
    Usuario usuario;
    String mensagem;
    List<String> c = new ArrayList<>();
    CheckBox cigarro, charuto, cigarroPalha, vape, cachimbo, narguile;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        getSupportActionBar().hide();
        email = findViewById(R.id.emailRegister);
        senha = findViewById(R.id.senhaRegister);
        senhaConfirm = findViewById(R.id.senhaConfirmRegister);
        cigarro = findViewById(R.id.cigarro);
        charuto = findViewById(R.id.charuto);
        cigarroPalha = findViewById(R.id.cigarroPalha);
        vape = findViewById(R.id.vape);
        cachimbo = findViewById(R.id.cachimbo);
        narguile = findViewById(R.id.narguile);

        cigarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    c.add(cigarro.getText().toString());
                }
            }
        });
        charuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    c.add(charuto.getText().toString());
                }
            }
        });
        cigarroPalha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    c.add(cigarroPalha.getText().toString());
                }
            }
        });
        vape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    c.add(vape.getText().toString());
                }
            }
        });
        cachimbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    c.add(cachimbo.getText().toString());
                }
            }
        });
        narguile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    c.add(narguile.getText().toString());
                }
            }
        });
    }

    public void register(){
        if(i == 0){
            if(verifica_uso(email.getText().toString()) == true){
                usuario = new Usuario(email.getText().toString(), senha.getText().toString());
                usuario.setCigarro(c);
                usuario.salvar();
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
            }
        }
    }

    public boolean verifica_uso(String email){
        int i = 0;
        if(senha.getText().toString().equals(senhaConfirm.getText().toString())){

        }else{
            print("Senhas incompativeis");
            i++;
        }

        if(email.contains("@")){

        }else{
            print("Email invalido");
            i++;
        }

        if(i == 0){
            return true;
        }else{
            return false;
        }
    }

    public void print(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void verifica_usuario(View view){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuarios");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Usuario uso = null;
                String l = email.getText().toString();
                i = 0;
                for(DataSnapshot d : snapshot.getChildren()){
                    uso = d.getValue(Usuario.class);
                    System.out.println(uso.getEmail());
                    if(uso.getEmail().equals(l)){
                        //existir
                        i = 1;
                        break;
                    }
                }
                if(i == 1){
                    print("Usuario existente");
                }else{
                    register();
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}