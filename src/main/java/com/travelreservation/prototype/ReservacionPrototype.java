// ReservacionPrototype.java
package com.travelreservation.prototype;

import com.travelreservation.model.Vuelo;
import com.travelreservation.model.Hotel;
import com.travelreservation.model.Automovil;

public class ReservacionPrototype {
    private Vuelo vuelo;
    private Hotel hotel;
    private Automovil automovil;

    public ReservacionPrototype(Vuelo vuelo, Hotel hotel, Automovil automovil) {
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.automovil = automovil;
    }

    public ReservacionPrototype clonar() {
        return new ReservacionPrototype(vuelo, hotel, automovil);
    }
}
