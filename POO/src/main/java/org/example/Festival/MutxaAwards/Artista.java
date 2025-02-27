package org.example.Festival.MutxaAwards;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes{
    private String nombre;
    private ArrayList<Categoria> categorias;
    private ArrayList<Premio> listaPremios;

    @Override
    public String toString() {
        return "Artista " + nombre +  ", con nominacion/es a" + categorias + ",y los premios que ha ganado" + listaPremios + '}';
    }

    public Artista(String nombre) {
        this.nombre = nombre;
        categorias = new ArrayList<>();
        listaPremios = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void esNominado(Categoria categoria){
        System.out.println("Artista " + nombre + " nominado a " +Categoria.valueOf(String.valueOf(categoria)));
        categorias.add(categoria);
    }

    public void ganarPremio(Premio premio){
        System.out.println("Artista " + nombre + " ha ganado el premio a" + premio.getCategoria());
        premio.setGanador(this);
        listaPremios.add(premio);
    }

    public void recogerPremio(Premio premio){
        System.out.println("El artista" + nombre + " sube a recoger el premio " + premio.getCategoria());
    }
    @Override
    public void aplaudir() {
        System.out.println("El artista " + nombre + " aplaudiendo... PLAS PLAS PLAS");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("Arista " +  nombre + " pasando por la alfombra roja");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El artista" +  nombre + " esta dando un discurso sobre el esfuerzo realizado para rodar la pelicula");
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El artista " + nombre + " esta celebrando el premio " + premio.getCategoria() + "otorgado a " + premio.getGanador().nombre);
    }
}
