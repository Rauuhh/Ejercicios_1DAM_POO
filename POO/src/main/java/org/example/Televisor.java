package org.example;

public class Televisor {

    private int canal;
    private int volumen;

    public void Televisor() {

    }

    public Televisor(int valorCanal, int volumen) {
        this.canal = valorCanal;
        this.volumen = volumen;
    }


    public void Televisor(int canal) {
        this.canal = canal;
    }

    public void subirCanal() {
    }

    public void bajarCanal() {
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal < 100) {
            this.canal = canal;
        }else {
            System.out.println("Canal no existe");
        };

    }

    public int getVolumen() {
        {
            return volumen;
        }

    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 & volumen < 100) {
            this.volumen = volumen;
        }else {
            System.out.println("Volumen incorrecto");
        }
    }
}
