package org.example.GestionInstituto;

import lombok.AllArgsConstructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
//Clase que representa a un curso
public class Estudiante {
    /**
     * @param nombre Nombre del estudiante que no puede ser nulo
     * @param edad Edad del estudiante
     * @param curso Curso en el que esta el estudiante
     */
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
