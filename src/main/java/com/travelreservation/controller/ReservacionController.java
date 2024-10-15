// ReservacionController.java
package com.travelreservation.controller;

import com.travelreservation.builder.PaqueteDeViajeBuilder;
import com.travelreservation.model.Automovil;
import com.travelreservation.model.Hotel;
import com.travelreservation.model.Vuelo;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservacionController {

    @PostMapping("/crear-paquete")
    public String crearPaquete(@RequestBody Vuelo vuelo, @RequestBody Hotel hotel, @RequestBody Automovil automovil) {
        PaqueteDeViajeBuilder builder = new PaqueteDeViajeBuilder()
                .setVuelo(vuelo)
                .setHotel(hotel)
                .setAutomovil(automovil);
        return builder.construirPaquete();
    }
}
