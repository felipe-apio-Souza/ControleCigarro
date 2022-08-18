package com.example.controlecigarro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText entrar, senha;
    static Usuario usuario;
    String mensagem;
    Boolean verifica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        entrar = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
    }

    public void entrar(){
        Intent i = new Intent(this, Inicial.class);
        startActivity(i);
    }

    public void print(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void verifica_usuario(View view){

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuarios");
        if(entrar.getText().toString().contains(".")){
            this.entrar.setText(this.entrar.getText().toString().replace(".", "1"));
        }
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    String l = entrar.getText().toString();
                    String s = senha.getText().toString();

                    if(d.getValue(Usuario.class).getEmail().equals(l) && d.getValue(Usuario.class).getSenha().equals(s)){
                        usuario = d.getValue(Usuario.class);
                        mensagem = "existente!";
                        verifica = true;
                        entrar();
                        break;
                    }else{
                        mensagem = "não existente";
                        verifica = false;
                        usuario = null;
                    }
                }
                print(mensagem);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void registrar(View view){
        Intent i = new Intent(this, Registrar.class);
        startActivity(i);
    }

}