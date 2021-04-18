package com.example.concepcion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Naturaleza extends AppCompatActivity {

    ImageView fotoActividad;
    TextView tituloActividad, descripcionActividad, descripcionNaturaleza, textoActividadNaturaleza;

    Actividad natural;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturaleza);

        fotoActividad=findViewById(R.id.fotoActividadNaturaleza);
        tituloActividad=findViewById(R.id.tituloActividadNaturaleza);
        descripcionNaturaleza=findViewById(R.id.descripcionNaturaleza);



        natural = (Actividad) getIntent().getSerializableExtra("natural");

        fotoActividad.setImageResource(natural.getFotoActividad());
        tituloActividad.setText(natural.getDescripcionActividad());
        descripcionNaturaleza.setText(natural.getDescripcionNaturaleza());


    }
}