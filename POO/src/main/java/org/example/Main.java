package org.example;

import org.example.Biblioteca.Editorial;
import org.example.Biblioteca.Estudiante;
import org.example.Biblioteca.Libro;
import org.example.Biblioteca.Prestamo;
import org.example.pruebas_lombok.Instituto2;

public class Main {
    public static void main(String[] args) {
        Instituto2 instituto = new Instituto2("IES Alluser","Mutxamel", "Calle Falsa 123");
        System.out.println(instituto);
        Instituto2 iesmutxamel = null;
            try{
                iesmutxamel = new Instituto2(null, "Mutxamel", "hola");
            }catch (NullPointerException e){
                System.out.println("El nombre no puede ser nulo");
            }
        System.out.println(iesmutxamel);
    }
}

