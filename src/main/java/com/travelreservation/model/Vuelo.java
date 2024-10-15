// Vuelo.java
package com.travelreservation.model;

public class Vuelo {
    private String aerolinea;
    private String destino;

    public Vuelo() {
    } // Constructor vacío para que funcione con JSON

    public Vuelo(String aerolinea, String destino) {
        this.aerolinea = aerolinea;
        this.destino = destino;
    }

    // Getters y Setters
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
