package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GruposActivity extends AppCompatActivity {

    private Button boton_grupos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos);
        boton_grupos = (Button)  findViewById(R.id.boton_MisGrupos);
        boton_grupos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMisGrupos();
            }
        });

    }
    private void abrirMisGrupos()
    {
        Intent intent = new Intent(this,ListaGruposActivity.class);
        startActivity(intent);

    }
}
