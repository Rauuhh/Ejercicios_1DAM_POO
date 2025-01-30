package org.example;

import java.util.Random;

public class Paciente {
    private final static char genero_def = 'X';
    public final static int sobrepeso = 1;
    public final static int peso_bajo = -1;
    public final static int peso_ideal = 0;
    private final static int mayoredad = 18;

    private String nombre;
    private int edad;
    private char genero;
    private String dni;
    private float peso;
    private float altura;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        comprobarGenero(genero);
    }
    public String getDni() {
        return this.dni;
    }
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public Paciente(String nombre, int edad, char genero, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarGenero(genero);
        this.peso = peso;
        this.altura = altura;
        generarDNI();
    }
    public Paciente(){
       // generarDNI();
       //this.genero = genero_def;
        this("",0,genero_def,0,0);
    }

    public Paciente(String nombre, int edad, char genero)
    {
        this(nombre,edad,genero,0,0);
    }
    private void generarDNI()
    {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(99999999) + 10000000;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numero%23;
        this.dni =   Integer.toString(numero)+ letras[resto] ;
    }
    public void mostrarInfoPaciente(){
        System.out.println("Paciente: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("DNI: " + this.dni);
        System.out.println("Genero: " + this.genero);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }

    public int calcularIMC()
    {
        double imc = peso/(Math.pow(altura,2));
        if (imc < 20)
        {
            return peso_bajo;
        }
        else if (imc > 25)
        {
            return sobrepeso;
        }
        else
        {
            return peso_ideal;
        }
    }
    public boolean esMayorDeEdad(){
        if (edad > mayoredad)
        {
            return true;
        }
        return false;
    }

    private void comprobarGenero(char sexo){
        if (sexo != 'H' && sexo != 'M')
        {
            this.genero = genero_def;
        }else {
            this.genero = sexo;
        }
    }
    @Override
    public String toString()
    {
      return  "Paciente: con nombre " + this.nombre + " y " + this.edad + " años de edad. Genero " + this.genero + " y dni:" + this.dni + " ,con peso: " + this.peso + " y con altura: " + this.altura ;
    }

}
