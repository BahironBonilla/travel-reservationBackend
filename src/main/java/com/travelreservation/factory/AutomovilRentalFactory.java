// AutomovilRentalFactory.java
package com.travelreservation.factory;

import com.travelreservation.model.Automovil;
import com.travelreservation.model.Hotel;
import com.travelreservation.model.Vuelo;

public class AutomovilRentalFactory extends ViajeFactory {
    @Override
    public Automovil crearAutomovil() {
        return new Automovil("Toyota", "Corolla");
    }

    public Hotel crearHotel() {
        return null;

    }

    public Vuelo crearVuelo() {
        return null;

    }
}
