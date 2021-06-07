package com.example.concepcion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

public class Naturaleza extends AppCompatActivity {

    ImageView fotoActividad;
    TextView tituloActividad, descripcionActividad, descripcionNaturaleza, textoActividadNaturaleza;

    Actividad natural;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturaleza);

        tituloActividad=findViewById(R.id.tituloActividadNaturaleza);
        fotoActividad=findViewById(R.id.fotoActividad);
        descripcionNaturaleza=findViewById(R.id.descripcionNaturaleza);

        natural = (Actividad) getIntent().getSerializableExtra("natural");

        tituloActividad.setText(natural.getDescripcionActividad());

        //fotoActividad.setImageResource(natural.getFotoActividad());
        descripcionNaturaleza.setText(natural.getDescripcionNaturaleza());


    }




}


