// PaqueteDeViajeBuilder.java
package com.travelreservation.builder;

import com.travelreservation.model.Vuelo;
import com.travelreservation.model.Hotel;
import com.travelreservation.model.Automovil;

public class PaqueteDeViajeBuilder {
    private Vuelo vuelo;
    private Hotel hotel;
    private Automovil automovil;

    public PaqueteDeViajeBuilder setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        return this;
    }

    public PaqueteDeViajeBuilder setHotel(Hotel hotel) {
        this.hotel = hotel;
        return this;
    }

    public PaqueteDeViajeBuilder setAutomovil(Automovil automovil) {
        this.automovil = automovil;
        return this;
    }

    public String construirPaquete() {
        return "Paquete con vuelo: " + vuelo.getDestino() + ", hotel: " + hotel.getNombre() + ", automóvil: "
                + automovil.getMarca();
    }
}
