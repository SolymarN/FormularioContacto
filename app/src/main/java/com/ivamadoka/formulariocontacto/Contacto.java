package com.ivamadoka.formulariocontacto;

public class Contacto {
    private String nombreCompleto;
    private String fecha;
    private String telefono;
    private String email;
    private String descripcion;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
