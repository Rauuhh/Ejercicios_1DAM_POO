package org.example.Pokemon;

public class Agua extends Pokemon implements AtaquesAgua{


    public Agua(int nivel, int ps){
        super(nivel,ps);
    }

    @Override
    public void atacar() {
        System.out.println("Pistola agua");
    }

    @Override
    public void hidrobomba() {
        System.out.println("Hidrobomba");
    }

    @Override
    public void surf() {
        System.out.println("Surf");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("Pistola Agua");
    }

    @Override
    public void salpicadura() {
        System.out.println("Salpicadura");
    }
}

