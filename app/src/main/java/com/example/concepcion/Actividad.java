package com.example.concepcion;

import java.io.Serializable;

public class Actividad implements Serializable {

    String fotoActividad;
    String tituloActividad;
    String descripcionActividad;
    String descripcionNaturaleza;

    public Actividad(String fotoActividad, String tituloActividad, String descripcionActividad, String descripcionNaturaleza) {
        this.fotoActividad = fotoActividad;
        this.tituloActividad = tituloActividad;
        this.descripcionActividad = descripcionActividad;
        this.descripcionNaturaleza = descripcionNaturaleza;

    }

    public String getFotoActividad() {
        return fotoActividad;
    }

    public void setFotoActividad(String fotoActividad) {
        this.fotoActividad = fotoActividad;
    }

    public String getTituloActividad() {
        return tituloActividad;
    }

    public void setTituloActividad(String tituloActividad) {
        this.tituloActividad = tituloActividad;
    }


    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }


    public String getDescripcionNaturaleza() {
        return descripcionNaturaleza;
    }

    public void setDescripcionNaturaleza(String descripcionNaturaleza) {
        this.descripcionNaturaleza = descripcionNaturaleza;
    }


}
