package org.example.Pokemon;

abstract class Pokemon {
    private int nivel;
    private int ps;

    public Pokemon(int nivel, int ps){
        this.nivel = nivel;
        this.ps = ps;
    }

    public void imprimirDatos(){
        System.out.println("Nivel = " + nivel + " vida = " + ps);
    }
    public abstract void atacar();
}
