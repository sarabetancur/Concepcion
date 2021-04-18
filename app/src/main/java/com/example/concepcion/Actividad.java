package com.example.concepcion;

import java.io.Serializable;

public class Actividad implements Serializable {

    int fotoActividad;
    String tituloActividad;
    String descripcionActividad, descripcionNaturaleza;

    public Actividad(int fotoActividad, String tituloActividad, String descripcionActividad, String descripcionNaturaleza) {
        this.fotoActividad = fotoActividad;
        this.tituloActividad = tituloActividad;
        this.descripcionActividad = descripcionActividad;
        this.descripcionNaturaleza = descripcionNaturaleza;

    }

    public int getFotoActividad() {
        return fotoActividad;
    }

    public void setFotoActividad(int fotoActividad) {
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
