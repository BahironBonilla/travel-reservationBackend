// Hotel.java
package com.travelreservation.model;

public class Hotel {
    private String nombre;
    private String ciudad;

    public Hotel() {
    }

    public Hotel(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
