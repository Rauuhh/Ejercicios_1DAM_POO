package org.example.GestionInstituto;

import lombok.AllArgsConstructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante {
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
