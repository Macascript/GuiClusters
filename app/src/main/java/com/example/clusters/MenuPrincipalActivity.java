package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuPrincipalActivity extends AppCompatActivity {

    private Button botonGrupos;
    private Button botonPerfil;
    private Button botonCalendario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        botonGrupos = (Button) findViewById(R.id.boton_Grupos);//inicializamos el boton
        botonGrupos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGrupos();
            }
        });

        botonPerfil = (Button) findViewById(R.id.boton_Perfil);
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerfil();
            }
        });

        botonCalendario = (Button) findViewById(R.id.boton_Calendario);
        botonCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendario();
            }
        });

    }

    protected void openGrupos()
    {
        Intent intent = new Intent(this,ListaGruposActivity.class);
        startActivity(intent);
    }
    protected void openPerfil()
    {
        Intent intent = new Intent(this,PerfilActivity.class);
        startActivity(intent);
    }

    protected void openCalendario()
    {
        Intent intent = new Intent(this,CalendarioActivity.class);
        startActivity(intent);

    }

    }
