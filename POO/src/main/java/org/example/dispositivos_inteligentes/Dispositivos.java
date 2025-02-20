//package org.example.dispositivos_inteligentes;
//
//import lombok.Getter;
//
//public abstract class Dispositivos {
//    @Getter
//    private String nombre;
//    private boolean estado;
//
//    public boolean getEstado() {
//        return estado;
//    }
//
//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void Dispositivo(String nombre)
//    {
//        this.nombre = nombre;
//        estado = false;
//    }
//
//    public abstract void endender();
//    public void apagar(){
//        if (estado){
//            estado = false;
//            System.out.println(nombre + " apagado");
//        }else
//        {
//            System.out.println(nombre + " ya esta apagado");
//        }
//
//    }
//    public void mostrarEstado(){
//        if (estado){
//            System.out.println(nombre + " encendido");
//        }else{
//            System.out.println(nombre + " apagado");
//        }
//    }
//}
