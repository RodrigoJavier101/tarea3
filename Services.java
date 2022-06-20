package com.mycompany.fastwing;

import javax.swing.JOptionPane;

public class Services {

    public static void seleccinarDestino() {

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
        String destinoSelecionado = "";

        if (seleccion.equals("1") || seleccion.equals("2") || seleccion.equals("3") || seleccion.equals("4") || seleccion.equals("5")) {
            seleccionNum = Integer.parseInt(seleccion);
            destinoSelecionado = destinos[seleccionNum - 1];
            validaValor = false;
        } else {
            while (validaValor) {
                if (seleccionNum >= 1 || seleccionNum <= 5) {
                    JOptionPane.showMessageDialog(null, "Por favor, selccione un destino valido");
                    seleccion = JOptionPane.showInputDialog(null, "Bienvenido!\n"
                            + "Donde desea ir? \n"
                            + mensaje);
                    if (seleccion.equals("1") || seleccion.equals("2") || seleccion.equals("3") || seleccion.equals("4") || seleccion.equals("5")) {
                        seleccionNum = Integer.parseInt(seleccion);
                        destinoSelecionado = destinos[seleccionNum - 1];
                        validaValor = false;
                    }
                } else {
                    validaValor = false;
                    JOptionPane.showMessageDialog(null, "Seleccionado " + destinoSelecionado);
                }
            }
        }
    }
}
