package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Info_GrupoActivity extends AppCompatActivity {

    private TextView t;
    private Button b1, b2 , b3;
    private ListView l;
    private String miembros[] = {"Juan Fco Bonachera" , "Patricio Da Silva", "Paco pepe"};
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos);

        nombre = "Grupo 1";
        t = (TextView) findViewById(R.id.nombre_grupo_id);
        t.setText(nombre);

        l = (ListView) findViewById(R.id.list_miembros_grupos);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_amigos, miembros);
        l.setAdapter(adapter);

        b1 = (Button) findViewById(R.id.silenciar_id);
        b2 = (Button) findViewById(R.id.abandonar_id);
        b3 = (Button) findViewById(R.id.borrar_id);
    }
}