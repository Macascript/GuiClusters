package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class PerfilActivity extends AppCompatActivity {
    private Button botonAmigos,botonEditarPerfil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        botonAmigos = (Button) findViewById(R.id.boton_Amigos);
        botonAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmigos();
            }
        });

        botonEditarPerfil = (Button) findViewById(R.id.boton_Editar_Perfil);
        botonEditarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEditarPerfil();
            }
        });

    }

    protected void openAmigos(){
        Intent intend = new Intent(this,AmigosActivity.class);
        startActivity(intend);
    }

    protected void openEditarPerfil()
    {
        Intent intend = new Intent(this,PerfilActivity.class);
        startActivity(intend);
    }
}
