package com.appusi.usiunidaddeserviciosinformaticos.Clases;

/**
 * Created by cvem8165 on 1/12/16.
 */

public class Sala {
    private String nombre;
    private String nombreBloque;
    private int capacidad;
    private String descripcion;
    private String color;


    public Sala(String nombre, String nombreBloque, int capacidad, String descripcion, String color) {
        this.nombre = nombre;
        this.nombreBloque = nombreBloque;
        this.capacidad = capacidad;
        this.descripcion = descripcion;
        this.color = color;
    }

    public Sala() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
