package com.example.concepcion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Actividad> listaDeDatos = new ArrayList<>();
    RecyclerView listaRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaRecyclerView=findViewById(R.id.listaRecyclerView);
        listaRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListado();

        AdaptadorLista adaptador = new AdaptadorLista(listaDeDatos);
        listaRecyclerView.setAdapter(adaptador);

    }

    private void crearListado() {
        listaDeDatos.add(new Actividad(R.drawable.cascada,
                "NATURALEZA y AVENTURA",
                getString(R.string.naturaleza2),
                getString(R.string.naturaleza1)


        ));


        listaDeDatos.add(new Actividad(R.drawable.intro,
                "CALLES Y ARQUITECTURA",
                getString(R.string.calles2),
                getString(R.string.calles1)


        ));


        listaDeDatos.add(new Actividad(R.drawable.comer,
                "COMER EN EL PUEBLO",
                getString(R.string.comer),
                getString(R.string.comer1)


        ));






    }








    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.bnt1){
            Toast.makeText(this,"Naturaleza", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.btn2){
            Toast.makeText(this,"Arquitectura", Toast.LENGTH_SHORT).show();
        }

        return super.onCreateOptionsMenu((Menu) item);
    }
}