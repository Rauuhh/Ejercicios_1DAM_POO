package org.example.GestionInstituto;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@AllArgsConstructor
@ToString
//Clase que representa a un curso
public class Curso {
    /**
     * @param nombre Nombre del curso que no puede ser nulo
     * @param horas Horas del curso
     */
    @NonNull
    private String nombre;
    private int horas;

}
