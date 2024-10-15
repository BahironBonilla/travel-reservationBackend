// ViajeFactory.java
package com.travelreservation.factory;

import com.travelreservation.model.Vuelo;
import com.travelreservation.model.Hotel;
import com.travelreservation.model.Automovil;

public abstract class ViajeFactory {
    public abstract Vuelo crearVuelo();

    public abstract Hotel crearHotel();

    public abstract Automovil crearAutomovil();
}
