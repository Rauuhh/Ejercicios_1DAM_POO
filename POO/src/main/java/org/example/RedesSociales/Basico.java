package org.example.RedesSociales;

public class Basico extends Usuario{
    public Basico(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informacion de la persona normal");
        super.mostrarInfo(); //llamamos al método de la clase Persona
        ;
    }
}
