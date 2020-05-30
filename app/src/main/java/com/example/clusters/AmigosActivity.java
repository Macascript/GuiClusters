package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AmigosActivity extends AppCompatActivity {
    private FloatingActionButton botonDesplegableAjustes,botonDesplegableBloquear,botonDesplegableInvitar;
    private Animation animOpen,animClose,rotateForward,rotateBackward;
    private Button botonAmigosSolicitudes,botonAmigos,botonAmigosBloqueados;
    private TextView listaAmigos;
    private ListView amigos;
    private String nombres[] = {"Pato","Juan Fran","Messi"}; //dentro de llaves elementos a mostrar
    private String edades[] = {"18","25","30"};

    boolean isOpen =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos);
        //TextView Inicializacion
        listaAmigos=(TextView) findViewById(R.id.txv_Lista_De_Amigos);
        //ListView Inicializacion
        amigos=(ListView)findViewById(R.id.lv_Amigos);
        //Botones Desplegables
        botonDesplegableAjustes = (FloatingActionButton) findViewById(R.id.boton_Desplegable_Ajustes);
        botonDesplegableBloquear = (FloatingActionButton) findViewById(R.id.boton_Desplegable_Bloquear);
        botonDesplegableInvitar = (FloatingActionButton) findViewById(R.id.boton_Desplegable_Invitar);
        //Botones
        botonAmigos = (Button) findViewById(R.id.boton_Amigos_Perfil);
        botonAmigosSolicitudes = (Button) findViewById(R.id.boton_Amigos_Solicitudes);
        botonAmigosBloqueados = (Button) findViewById(R.id.boton_Amigos_Bloqueados);
        //Animaciones
        animOpen= AnimationUtils.loadAnimation(this,R.anim.fab_open);
        animClose= AnimationUtils.loadAnimation(this,R.anim.fab_close);
        rotateForward = AnimationUtils.loadAnimation(this,R.anim.rotate_forward);
        rotateBackward = AnimationUtils.loadAnimation(this,R.anim.rotate_backward);
        //ListView ADAPTADOR PLANTILLA PARA LISTA
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item_amigos,nombres);
        amigos.setAdapter(adapter); //le damos valor al adaptador de lv1
        //ListView Listener
        amigos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               listaAmigos.setText("La edad de "+amigos.getItemAtPosition(position)+" es "+edades[position] +" años" );
            }
        });
        //Botones desplegables listener
        botonDesplegableAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
            }
            });

        botonDesplegableBloquear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AmigosActivity.this,"Bloquear Usuario Pulsado", Toast.LENGTH_SHORT).show();
            }
        });

        botonDesplegableInvitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AmigosActivity.this,"Invitar Usuario Pulsado", Toast.LENGTH_SHORT).show();
            }
        });
        //Botones Listener

        botonAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmigos();
            }
        });

        botonAmigosBloqueados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmigosBloqueados();
            }
        });

        botonAmigosSolicitudes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmigosSolicitudes();
            }
        });

        }
      //Funciones de boton
    private void openAmigos()
    {
        Intent reg = new Intent(this,AmigosActivity.class);//creamos un intento con su clase
        startActivity(reg);//abrimos la actividad de registrarse a traves del intento
    }

    private void openAmigosBloqueados()
    {
        Intent reg = new Intent(this,AmigosBloqueadosActivity.class);//creamos un intento con su clase
        startActivity(reg);//abrimos la actividad de registrarse a traves del intento
    }

    private void openAmigosSolicitudes()
    {
        Intent reg = new Intent(this,AmigosSolicitudesActivity.class);//creamos un intento con su clase
        startActivity(reg);//abrimos la actividad de registrarse a traves del intento
    }
     //Funciones de animaciones
    private void animateFab()
    {
        if(isOpen)
        {
            botonDesplegableAjustes.startAnimation(rotateForward);
            botonDesplegableBloquear.startAnimation(animClose);
            botonDesplegableInvitar.startAnimation(animClose);

            botonDesplegableBloquear.setClickable(false);
            botonDesplegableInvitar.setClickable(false);
            isOpen=false;
        }
        else
        {
            botonDesplegableAjustes.startAnimation(rotateBackward);
            botonDesplegableBloquear.startAnimation(animOpen);
            botonDesplegableInvitar.startAnimation(animOpen);

            botonDesplegableBloquear.setClickable(true);
            botonDesplegableInvitar.setClickable(true);
            isOpen=true;

        }


    }
}

