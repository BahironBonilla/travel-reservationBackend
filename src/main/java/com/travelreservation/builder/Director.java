// Director.java
package com.travelreservation.builder;

import com.travelreservation.factory.ViajeFactory;

public class Director {
    private ViajeFactory factory;

    public Director(ViajeFactory factory) {
        this.factory = factory;
    }

    public String construirPaquete() {
        return new PaqueteDeViajeBuilder()
                .setVuelo(factory.crearVuelo())
                .setHotel(factory.crearHotel())
                .setAutomovil(factory.crearAutomovil())
                .construirPaquete();
    }
}
