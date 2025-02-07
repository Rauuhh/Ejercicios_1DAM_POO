package org.example.GestionInstituto;

import lombok.*;
import org.example.Biblioteca.Libro;

import java.util.ArrayList;
import java.util.Objects;

@Setter
@Getter
@ToString
public class Instituto {
    /**
     * @param nombre Nombre del instituto
     * @param poblacion Pueblo/Ciudad donde esta el Instituto
     * @param ListaEstudiantes Lista que nos devuelve el numero de estudiantes
     * @param ListaCursos Lista que devuelve el numero de cursos
     */
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> ListaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> ListaCursos = new ArrayList<>();

    /**
     * @param estudiante Metodo que nos agrega un estudiante si su nombre no es null
     */
    public void agregarEstudiante(Estudiante estudiante){
            if(estudiante == null){
                System.out.println("No se puede agregar un estudiante nulo");
            }else{
                ListaEstudiantes.add(estudiante);
            }
    }

    /**
     * @param curso Metodo que nos agrega un curso si su nombre es nulo
     */
    public void agregarCurso(Curso curso){
        if(curso == null){
            System.out.println("No se puede agregar un curso nulo");
        }else{
            ListaCursos.add(curso);
        }
    }

    /**
     *
     * @param nombre Metodo que cuando creamos un insituto, si el nombre es null, el nombre es = "Instituto sin nombre"
     */
    public Instituto (String nombre){
        this.nombre =   Objects.requireNonNullElse(nombre,"Instituto sin nombre");
    }
}
