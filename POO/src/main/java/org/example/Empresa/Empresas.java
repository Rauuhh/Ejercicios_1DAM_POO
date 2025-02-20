package org.example.Empresa;

import org.example.Festival.Persona;

public class Empresas {
    public static void main(String[] args){

        Empleado gerente = new Gerente();
        Empleado desa = new Desarrollador();
        Empleado[] empleados = {
            new Desarrollador(),
            new Diseñador(),
            new Gerente()
        };
        for (Empleado empleado : empleados){
            empleado.realizarTarea();
        }
        System.out.println();

        asignarTarea(gerente);
        asignarTarea(desa);

    }
    public static void asignarTarea(Empleado empleado){
        empleado.realizarTarea();
    }
}
