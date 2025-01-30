package org.example.Biblioteca;

import java.util.ArrayList;

public class Estudiante {
    public static int contadorEstudiantes = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> libroPrestados;
    public Estudiante(String nombre){
        libroPrestados = new ArrayList<>();
        this.nombre = nombre;
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }
    public Estudiante(String nombre, String curso, String email){
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
        libroPrestados = new ArrayList<>();
    }
    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNia() {
        return this.nia;
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Libro> getLibroPrestados() {
        return libroPrestados;
    }

    public void setLibroPrestados(ArrayList<Libro> libroPrestados) {
        this.libroPrestados = libroPrestados;
    }

    public void anyadirLibro(Libro libro){
        libroPrestados.add(libro);
    }
    public void borrarLibro(Libro libro){
        libroPrestados.remove(libro);
    }

    @Override
    public String toString() {
  //      if (!libroPrestados.isEmpty()) {
            return " Alumno: [" + nombre + " curso: " + curso + " nia:" + nia + " email: " + email + "Libro: " + libroPrestados + "]";
//        }
//        return " Alumno: [" + this.nombre + " curso: " + this.curso + " nia:" + this.nia + " email: " + this.email + "]";
  }
    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String email)
    {
        return email.matches(FORMATO_CORREO) && email != null;

        }
    }

