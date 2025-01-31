package org.example.Casa;

import java.util.ArrayList;

public class Habitacion {
    public double getMetrosCuadrados;
    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;
    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = this.metrosCuadrados;
        }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void agregarElectrodomestico(String nombre, int consumo){
        boolean existe = false;
        for (Electrodomestico electrodomestico : electrodomesticos){
            if (electrodomestico.getNombre().equals(nombre)) {
                System.out.println("El electrodomestico ya existe");
                existe = true;
                return;
            }
        }
        Electrodomestico electrodomestico = new Electrodomestico(nombre,consumo);
    }
    public void mostrarElectrodomestico (String nombre, int consumo){
        System.out.println("La habitacion tiene " + nombre + " que consume " + consumo + "kWh");
        for(Electrodomestico electrodomestico : electrodomesticos){
            System.out.println("- " + electrodomestico.getNombre() + " (" + electrodomestico.getConsumo() + " kWh)");
        }
    }

        @Override
        public String toString() {
            return "Habitacion: [ nombre= " + getNombre() + " metros cuadrados" + getMetrosCuadrados() + "]";
        }
    }

