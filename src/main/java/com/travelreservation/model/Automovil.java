// Automovil.java
package com.travelreservation.model;

public class Automovil {
    private String marca;
    private String modelo;

    public Automovil() {
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
