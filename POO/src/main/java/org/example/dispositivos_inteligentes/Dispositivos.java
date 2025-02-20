package org.example.dispositivos_inteligentes;

public abstract class Dispositivos {

    private String nombre;
    private boolean estado; //encendido/apagado

    public Dispositivos(String nombre){
        this.nombre=nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar(){

        if(estado){
            estado=false;
            System.out.println("Apagando " + nombre + "... apagado.");
        }else{
            System.out.println(nombre + " ya está apagado.");
        }

    }

    public void mostrarEstado(){

        if(estado){
            System.out.println(nombre + ": Encendido");
        }else{
            System.out.println(nombre + ": Apagado");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }






}