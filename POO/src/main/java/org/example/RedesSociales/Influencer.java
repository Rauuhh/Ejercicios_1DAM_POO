package org.example.RedesSociales;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones = new ArrayList<>();

    public Influencer(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
    }

    public void anyadirColaboradores(String... colabos){
        colaboraciones.addAll(Arrays.asList(colabos));
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Informacion del influencer");
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
