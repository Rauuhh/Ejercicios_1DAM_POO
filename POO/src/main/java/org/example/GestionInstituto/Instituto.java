package org.example.GestionInstituto;

import lombok.*;
import org.example.Biblioteca.Libro;

import java.util.ArrayList;
import java.util.Objects;

@Setter
@Getter
@ToString
public class Instituto {
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> ListaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> ListaCursos = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante){
            if(estudiante == null){
                System.out.println("No se puede agregar un estudiante nulo");
            }else{
                ListaEstudiantes.add(estudiante);
            }
    }

    public void agregarCurso(Curso curso){
        if(curso == null){
            System.out.println("No se puede agregar un curso nulo");
        }else{
            ListaCursos.add(curso);
        }
    }
    public Instituto (String nombre){
        this.nombre =   Objects.requireNonNullElse(nombre,"Instituto sin nombre");
    }
}
