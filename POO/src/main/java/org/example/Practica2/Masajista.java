package org.example.Practica2;

public class Masajista {

    String titulacion;
    int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia){
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Jugador jugador){

    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion='" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
}
