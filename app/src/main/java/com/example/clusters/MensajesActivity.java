package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MensajesActivity extends AppCompatActivity {
    private ImageButton botonGrupo;
    private ImageButton enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes);
        botonGrupo = (ImageButton) findViewById(R.id.botonBackGrupos);
        botonGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backGrupos();
            }
        });

        enviar = (ImageButton) findViewById(R.id.enviarBoton);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarMensaje();
            }
        });

    }

    private void enviarMensaje() {
        Intent i = new Intent (this, GruposActivity.class);
        startActivity(i);
    }

    private void backGrupos() {
        Intent i = new Intent(this, GruposActivity.class);
        startActivity(i); //puta interfaz de mierda.
    }




}
