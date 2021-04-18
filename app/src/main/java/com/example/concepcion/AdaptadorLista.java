package com.example.concepcion;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder>{

    ArrayList<Actividad> listaDeDatos;

    public AdaptadorLista(ArrayList<Actividad> listaDeDatos) {
        this.listaDeDatos = listaDeDatos;

    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaListado= LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_de_lista,null,false);
        return new viewHolder(vistaListado);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {
        holder.actualizarDatosDeItem(listaDeDatos.get(position));

    }

    @Override
    public int getItemCount() {
        return listaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tituloActividad;
        ImageView fotoActividad;
        TextView descripcionActividad, descripcionNaturaleza;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

          tituloActividad=itemView.findViewById(R.id.tituloActividad);
          fotoActividad=itemView.findViewById(R.id.fotoActividad);
          descripcionActividad=itemView.findViewById(R.id.descripcionActividad);


        }

        public void actualizarDatosDeItem(final Actividad actividad) {

            fotoActividad.setImageResource(actividad.getFotoActividad());
            tituloActividad.setText(actividad.getTituloActividad());
            descripcionActividad.setText(actividad.getDescripcionActividad());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Naturaleza.class);
                    intent.putExtra("natural",actividad);
                    itemView.getContext().startActivity(intent);

                }
            });

        }
    }
}
