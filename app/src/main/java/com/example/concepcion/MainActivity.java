package com.example.concepcion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ArrayList<Actividad> listaDeDatos = new ArrayList<>();
    RecyclerView listaRecyclerView;
    FirebaseFirestore baseDatos = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaRecyclerView=findViewById(R.id.listaRecyclerView);
        listaRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListado();


    }

    private void crearListado() {

        baseDatos.collection("actividad")
            .get()
            .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                @Override
                public void onComplete(@NonNull Task<QuerySnapshot> task) {

                    if (task.isSuccessful()){
                        for(QueryDocumentSnapshot document: task.getResult()){


                            String fotoActividad = document.get("fotoActividad").toString();
                            String tituloActividad = document.get("tituloActividad").toString();
                            String descripcionActividad = document.get("descripcionActividad").toString();
                            String descripcionNaturaleza = document.get("descripcionNaturaleza").toString();

                            listaDeDatos.add(new Actividad(fotoActividad,tituloActividad,descripcionActividad,descripcionNaturaleza));

                        }


                        AdaptadorLista adaptador = new AdaptadorLista(listaDeDatos);
                        listaRecyclerView.setAdapter(adaptador);

                    }else{
                        Toast.makeText(getApplicationContext(),"Error consultando datos ", Toast.LENGTH_LONG).show();
                    }
                }
            });


    }


    public void cambiarIdioma(String lenguaje){

        Locale idioma=new Locale(lenguaje);
        Locale.setDefault(idioma);

        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=idioma;
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

       switch (id){

           case R.id.bnt1:
               Intent intent = new Intent(MainActivity.this, Perfil.class);
               startActivity(intent);
           break;

           case R.id.btn2:
               this.cambiarIdioma("en");
               Intent intent2=new Intent(MainActivity.this,MainActivity.class);
               startActivity(intent2);
           break;

           case R.id.btn3:
               this.cambiarIdioma("es");
               Intent intent3=new Intent(MainActivity.this,MainActivity.class);
               startActivity(intent3);
           break;
       }

       return super.onOptionsItemSelected(item);
}
}