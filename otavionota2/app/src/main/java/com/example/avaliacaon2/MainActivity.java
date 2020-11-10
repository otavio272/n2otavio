package com.example.avaliacaon2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button entrar;
    public EditText usuario;
    public EditText senha;
    public TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrar = findViewById(R.id.loginButton);
        usuario = findViewById(R.id.editUsername);
        senha = findViewById(R.id.editPassword);
        status = findViewById(R.id.statusText);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((this.usuario.getText().toString().equals("otavio") && this.senha.getText().toString().equals("otavio123"))){
                    status.setText("Login efetuado com sucesso, bem-vindo.");
                }else{
                    status.setText("Usuário ou senha inválido.");
                }
            }
        });

    }
} 