// HotelFactory.java
package com.travelreservation.factory;

import com.travelreservation.model.Automovil;
import com.travelreservation.model.Hotel;
import com.travelreservation.model.Vuelo;

public class HotelFactory extends ViajeFactory {
    @Override
    public Hotel crearHotel() {
        return new Hotel("Hotel de Lujo", "Nueva York");
    }

    public Automovil crearAutomovil() {
        return null;

    }

    public Vuelo crearVuelo() {
        return null;

    }
}
