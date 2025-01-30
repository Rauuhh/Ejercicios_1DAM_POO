package org.example;

public class Estudiante {
    public static int contadorEstudiantes = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private String nombre;
    private String curso;
    private int nia;
    private String email;



    private Libro libroPrestado;
    public Estudiante(String nombre){
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
    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    @Override
    public String toString() {
        if (libroPrestado != null) {
            return " Alumno: [" + this.nombre + " curso: " + this.curso + " nia:" + this.nia + " email: " + this.email + "Libro: " + getLibroPrestado().getTitulo() + "]";
        }
        return " Alumno: [" + this.nombre + " curso: " + this.curso + " nia:" + this.nia + " email: " + this.email + "]";
    }
    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String email)
    {
        return email.matches(FORMATO_CORREO) && email != null;

        }
    }

