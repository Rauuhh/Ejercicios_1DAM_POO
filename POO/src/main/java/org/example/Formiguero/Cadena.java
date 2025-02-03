package org.example.Formiguero;

import org.example.Biblioteca.Libro;

import java.util.ArrayList;

public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre){
        this.nombre = nombre;
        listaProgramas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public void anyadirPrograma(Programa programa){
        listaProgramas.add(programa);
    }
    @Override
    public String toString() {
        return "Cadena{" + "nombre='" + nombre + '\'' + ", listaProgramas=" + listaProgramas + '}';
    }
}
