// AerolineaFactory.java
package com.travelreservation.factory;

import com.travelreservation.model.Automovil;
import com.travelreservation.model.Hotel;
import com.travelreservation.model.Vuelo;

public class AerolineaFactory extends ViajeFactory {
    @Override
    public Vuelo crearVuelo() {
        return new Vuelo("AerolineaX", "París");
    }

    // Implementaciones para Hotel y Automovil si es necesario
    public Hotel crearHotel() {
        return null;

    }

    public Automovil crearAutomovil() {
        return null;

    }
}
