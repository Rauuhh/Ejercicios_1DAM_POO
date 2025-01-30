package org.example;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   Persona persona1 = new Persona("Pepe", "Sanchez", "12345678A", 80, 30, "Marrakech", "Gitano");
        Persona persona2 = new Persona();
        Televisor opcion = new Televisor(1,5);
        System.out.println("Canal anterior: " + opcion.getCanal());
        opcion.setCanal(10);
        System.out.println("Canal actual: " + opcion.getCanal());
        System.out.println("Volumen anterior: " + opcion.getVolumen());
        opcion.setVolumen(105);
        System.out.println("Volumen actual: " + opcion.getVolumen());
       Paciente paciente_fit = new Paciente("Llados",40,'M',130.0F,1.7F);
        paciente_fit.mostrarInfoPaciente();
        Paciente paciente1 = new Paciente();
        paciente1.mostrarInfoPaciente();
        Paciente paciente2 = new Paciente("Boix", 18,'H');
        paciente2.mostrarInfoPaciente();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = entrada.next();
        System.out.println("Introduce la edad");
        int edad = entrada.nextInt();
        System.out.println("Introduce tu genero");
        char genero = entrada.next().charAt(0);
        System.out.println("Introduce tu peso (Kg)");
        float peso = entrada.nextFloat();
        System.out.println("Introduce tu altura");
        float altura = entrada.nextFloat();

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente(nombre,edad,genero);
        Paciente paciente3 = new Paciente(nombre,edad,genero,peso,altura);
        paciente1.setNombre("Paco");
        paciente1.setEdad(35);
        paciente1.setGenero('H');
        paciente1.setPeso(87);
        paciente1.setAltura(1.95F);

        comprobarPeso(paciente1);
        comprobarPeso(paciente2);
        comprobarPeso(paciente3);
        paciente1.calcularIMC();

        mayorEdad(paciente1);
        mayorEdad(paciente2);
        mayorEdad(paciente3);
        System.out.println(paciente3);
    }
    public static void comprobarPeso(Paciente paciente){
        int imc = paciente.calcularIMC();
        switch (imc){
            case Paciente.peso_bajo:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Paciente.peso_ideal:
                System.out.println("Estas en tu peso ideal");
                break;
            case Paciente.sobrepeso:
                System.out.println("La persona esta por encima de su peso ideal");
        }
    }
    public static void mayorEdad(Paciente paciente){
        if (paciente.esMayorDeEdad()){
            System.out.println("La persona " + paciente.getNombre() + " es mayor de edad");
        }
        else{
            System.out.println("La persona " + paciente.getNombre() + " no es mayor de edad");

        }*/

        Estudiante estudiante1 = new Estudiante("Manuel", "2 ASIR", "noseque@alu.edu.gva.es");
        Editorial editorial = new Editorial("Freelance", "España");
        Libro libro1 = new Libro("La novia de Pol", "Mostopapi", editorial);
        Libro libro2 = new Libro("La novia de Pol 2", "Mostopapi", editorial);
        System.out.println(libro1);
        System.out.println(libro2);
        Prestamo prestamo = libro1.prestar(estudiante1);
        System.out.println(prestamo);
        System.out.println(libro1);
        System.out.println(estudiante1);
        System.out.println(libro1.getLibrosDisponibles());
        libro1.devolver(estudiante1);
        System.out.println(libro1);
        System.out.println(estudiante1);
        System.out.println(libro1.getLibrosDisponibles());
        libro1.devolver(estudiante1);
        libro2.devolver(estudiante1);
        System.out.println(estudiante1);

    }
}

