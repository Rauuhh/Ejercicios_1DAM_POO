package org.example;
import java.util.ArrayList;
public class Cadena {
    //Creo las variables del nombre y la cantidas de programas que tentra nuestra cadenna
    private String nombre;
    private ArrayList<Programa> listaProgramas;
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

    public Cadena(){
        this.listaProgramas = new ArrayList<>();
    }

    public Cadena(String nombre) {
        this.nombre = nombre;
        listaProgramas = new ArrayList<>();

    }

    public void agregarPrograma(Programa programa) {
        //metodo para agregar programas
        listaProgramas.add(programa);
        programa.setCadena(this);
    }

    public void borrarPrograma(Programa programa) {
        //metodo para borrar programas
        listaProgramas.remove(programa);
        programa.setCadena(new Cadena());
    }

    @Override
    public String toString() {
        return "Cadena{" + "nombre='" + nombre +  ", listaProgramas=" + listaProgramas + '}';
    }
}
