package org.example.Pokemon;

import org.example.Empleado;

public class Electrico extends Pokemon {

    private int ps;

    public Electrico(int nivel, int ps){
        super(nivel,ps);
    }

    @Override
    public void atacar() {
        System.out.println("Electrotela");
    }
}
