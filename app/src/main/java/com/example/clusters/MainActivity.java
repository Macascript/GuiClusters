package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button botonRegistro,botonLogin;//creamos un boton
private EditText textoNombreIniciarSesion,textoPasswordIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Editext inicializacion
    textoNombreIniciarSesion = (EditText)findViewById(R.id.edit_Usuario_Iniciar_Sesion) ;
    textoPasswordIniciarSesion = (EditText)findViewById(R.id.edit_Password_Iniciar_Sesion) ;
    //Botones Inicializacion
        botonRegistro = (Button) findViewById(R.id.boton_Registrarse);//inicializamos el boton
        botonLogin=(Button)findViewById(R.id.boton_Login);
    //Botones Listener
        botonRegistro.setOnClickListener(new View.OnClickListener() {//le ponemos un escuchador de click al boton
            @Override
            public void onClick(View v) {
                openRegistrarse();//metodo para llamar a layout registro
            }
        });


        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();

            }
        });
    }

    //Metodos Botones
    protected void openRegistrarse()
    {
        Intent reg = new Intent(this,Registrarse.class);//creamos un intento con su clase
        startActivity(reg);//abrimos la actividad de registrarse a traves del intento
    }

    protected void openLogin()
    {
        //Validamos los campos introducidos
        String nombre = textoNombreIniciarSesion.getText().toString();
        String password = textoPasswordIniciarSesion.getText().toString();

        if(nombre.length()==0 && password.length()==0)
        {
            Toast.makeText(this,"Rellene los campos", Toast.LENGTH_LONG).show();
        }
        else if(nombre.length()==0)
        {
            Toast.makeText(this,"Ingresa un usuario",Toast.LENGTH_LONG).show();
        }
        else if(password.length()==0)
        {
            Toast.makeText(this,"Ingresa una contraseña", Toast.LENGTH_LONG).show();
        }

        if(nombre.length()!=0 && password.length()!=0)
        {
            Toast.makeText(this,"Iniciando Sesion ...", Toast.LENGTH_LONG).show();
            Intent reg = new Intent(this,MenuPrincipalActivity.class);//creamos un intento con su clase
            startActivity(reg);//abrimos la actividad de registrarse a traves del intento
        }




    }
}
