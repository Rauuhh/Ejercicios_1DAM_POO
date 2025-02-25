package org.example.Festival;

import org.example.herencia_vehiculo.Tren;

public class Persona {

    private static int EDAD_MIN = 18;

    String nombre;
    int edad;
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        if (edad < EDAD_MIN){
            throw new EdadMinimaException("No se puede crear a una persona menor de edad");
        }
    }


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }
    public void accederEvento(){
        System.out.println("Accediendo al evento");
    }
}
