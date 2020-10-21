package com.rodrigo.appexampleproject;

public class Usuario {
    String Nombre;
    String Apellido;
    String Correo;
    String Contrasenia;
    String RContrasenia;
    String Telefono;
    String Genero;

    public Usuario(String nombre, String apellido, String correo,
                   String contrasenia, String RContrasenia, String telefono, String genero) {
        Nombre = nombre;
        Apellido = apellido;
        Correo = correo;
        Contrasenia = contrasenia;
        this.RContrasenia = RContrasenia;
        Telefono = telefono;
        Genero = genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

    public String getRContrasenia() {
        return RContrasenia;
    }

    public void setRContrasenia(String RContrasenia) {
        this.RContrasenia = RContrasenia;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
