package org.example.Casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    Scanner entrada = new Scanner(System.in);
        private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
        private Propietario propietario;
        public Casa(String direccion) {
            this.direccion = direccion;
            this.habitaciones = new ArrayList<>();
            setPropietario();

        }

        public Propietario getPropietario() {
            return propietario;
        }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" + "entrada=" + entrada + ", direccion='" + direccion + '\'' + ", habitaciones=" + habitaciones + ", propietario=" + propietario + '}';
    }

    public void setPropietario() {
            System.out.println("Inserte propietari@");
            String nombre = entrada.next();
            System.out.println("Inserte su edad");
            int edad = entrada.nextInt();
            propietario = new Propietario(nombre,edad);
        }
        public void agregarHabitacion(String nombre, double metros) {
            boolean existe = false;
            for (Habitacion hab : habitaciones){
                if (hab.getNombre().equals(nombre)) {
                    System.out.println("La habitacion ya existe");
                    existe = true;
                    return;
                }
            }
            Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
            habitaciones.add(habitacion);
        }

        public void mostrarHabitaciones() {
            System.out.println("Casa en " + direccion + " tiene :" + habitaciones.size() +  "habitaciones");
            for(Habitacion hab :habitaciones){
                System.out.println("- " + hab.getNombre() + " (" + hab.getMetrosCuadrados() + " m2)");
            }
        }
        public Habitacion getHabitacionMasGrande(){
            Habitacion mayor = habitaciones.get(0);
            for (Habitacion hab: habitaciones){
            if (hab.getMetrosCuadrados() < mayor.getMetrosCuadrados)
                mayor = hab;

            }

            return mayor;
        }
        public void eliminarHabitacion(String nombre){
            for (Habitacion hab : habitaciones){
                if (hab.getNombre().equals(nombre)){
                    habitaciones.remove(hab);
                    return;
                }
            }
        }


    }

