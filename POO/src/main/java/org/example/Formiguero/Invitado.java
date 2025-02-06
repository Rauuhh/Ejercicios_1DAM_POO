package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Invitado {
    Scanner entrada = new Scanner(System.in);
// creamos las clases que necesita invitado
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;
    private ArrayList<Programa> listaProgramas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = pedirFecha();
        this.temporada = temporada;
    }

    private LocalDate pedirFecha() {
        // metodo para dcirle la fecha que acude el invitado al programa
        System.out.println("Introduce el año en el que acudirá " + this.getNombre());
        int anyo = entrada.nextInt();
        System.out.println("Introduce el mes:");
        int mes = entrada.nextInt();
        System.out.println("Introduce el día:");
        int dia = entrada.nextInt();
        return LocalDate.of(anyo,mes,dia);
    }


    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
