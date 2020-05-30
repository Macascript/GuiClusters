package com.example.clusters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AmigosSolicitudesActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;
    private String nombres[] = {"Samuel","Valentina","Santiago"}; //dentro de llaves elementos a mostrar
    private String edades[] = {"18","25","30"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos_solicitudes);

        tv1= (TextView)findViewById(R.id.tv1); //inicializamos las variables
        lv1 = (ListView)findViewById(R.id.lv1);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombres); con la layout android
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item_amigos,nombres);
        lv1.setAdapter(adapter); //le damos valor al adaptador de lv1

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La edad de "+lv1.getItemAtPosition(position)+" es "+edades[position] +" años" );
            }
        });
    }
}
