package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ListaGruposActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;
    private ImageButton boton_atras;
    private String grupos[]  = {"Grupo 1", "Grupo 2", "Grupo 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_grupos);

        boton_atras = (ImageButton) findViewById(R.id.boton_atras);
        boton_atras.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                enviarAtras ();
            }
        });


        tv1 = (TextView) findViewById(R.id.tv);
        lv1 = (ListView) findViewById(R.id.lv1);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_amigos, grupos);
        lv1.setAdapter(adapter);


       /* lv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarGrupo();
            }
        });*/
    }

    /*private void enviarGrupo() {
        Intent i = new Intent (this, GruposActivity.class);
        startActivity(i);
    }*/

    private void enviarAtras() {
        Intent i = new Intent(this, GruposActivity.class);
        startActivity(i);
    }

    private void setListaGrupos (String [] listaGrupos) {
        this.grupos = listaGrupos;
    }
}