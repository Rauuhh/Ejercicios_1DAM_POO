package org.example.GestionInstituto;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Curso {
    @NonNull
    private String nombre;
    private int horas;

}
