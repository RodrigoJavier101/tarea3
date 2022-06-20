package com.mycompany.fastwing;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
    Mostrar una lista de pasajeros.
    Mostrar una lista de tickets.
    Mostrar una lista de vuelos.
    
    Configurar un Scanner y obtener vuelos por id
    Mostrar por consola a todos los pasajeros que pertenezcan a un vuelo.
    
    Generar un método para modificar el nombre de un pasajero.
    Generar un método para modificar el destino de un vuelo.
    Mostrar por consola los ticket que pertenezcan a un pasajero.
 */
public class FastWing {

    public static void main(String[] args) {
        String[] destinos = {"Brasil", "Argentina", "Peru", "Republica Dominicana", "Colombia"};
        String mensaje = "";
        boolean validaValor = true;
        for (int i = 0; i < destinos.length; i++) {
            mensaje += (i + 1) + " " + destinos[i] + "\n";
        }

        String seleccion = JOptionPane.showInputDialog(null, "Bienvenido!\n"
                + "Donde desea ir? \n"
                + mensaje);
        int seleccionNum = 0;

        if (seleccion.equals("1") || seleccion.equals("2") || seleccion.equals("3") || seleccion.equals("4") || seleccion.equals("5")) {
            seleccionNum = Integer.parseInt(seleccion);
            validaValor = false;
        } else {
            while (validaValor) {
                if (seleccionNum >= 1 && seleccionNum <= 5) {
                    JOptionPane.showMessageDialog(null, "Por favor, selccione un destino valido");
                    seleccion = JOptionPane.showInputDialog(null, "Bienvenido!\n"
                            + "Donde desea ir? \n"
                            + mensaje);
                    if (seleccion.equals("1") || seleccion.equals("2") || seleccion.equals("3") || seleccion.equals("4") || seleccion.equals("5")) {
                        seleccionNum = Integer.parseInt(seleccion);
                        validaValor = false;
                    }
                } else {
                    validaValor = false;
                }
            }
        }

    }
}
