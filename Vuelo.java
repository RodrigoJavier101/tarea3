package com.mycompany.fastwing;

import java.time.LocalDateTime;

/*

    disponibilidad de asientos que debe de ser un numero del tipo Integer
    Una fecha del tipo LocalDateTime
 */
public class Vuelo {

    long id;
    String password;
    String destino;
    boolean hasScalas;
    int asientosDisponbles;
    LocalDateTime fechaVuelo;

    Vuelo(long id, String password, String destino, boolean hasScalas, int asientosDisponbles, LocalDateTime fechaVuelo) {
        this.id = id;
        this.password = password;
        this.destino = destino;
        this.hasScalas = hasScalas;
        this.asientosDisponbles = asientosDisponbles;
        this.fechaVuelo = fechaVuelo;
    }

}
