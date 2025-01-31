package org.example.Casa;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AppCasa {
        public static void main(String[] args) {

            Casa casa = new Casa("Calle Mayor 123");

            System.out.println(casa.getPropietario());
            casa.agregarHabitacion("Dormitorio",40);
            casa.agregarHabitacion("Cocina",35);
            casa.agregarHabitacion("Baño",10);

            casa.mostrarHabitaciones();


        }
    }

