package com.rodrigo.appexampleproject;

public class Producto {
    private int id;
    private String Nombre;
    private double Precio;
    private String Descripcion;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio, String descripcion) {
        this.id = id;
        Nombre = nombre;
        Precio = precio;
        Descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
