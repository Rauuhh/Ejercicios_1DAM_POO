package org.example.herencia_vehiculo;

public class Vehiculo {

    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
    }
    public void imprimirInfo(){
        System.out.println("Vehiculo de la marca " + marca + " con matricula " + matricula);
    }

    public void ruido(){
        System.out.println("brrr brrr");
    }
}
