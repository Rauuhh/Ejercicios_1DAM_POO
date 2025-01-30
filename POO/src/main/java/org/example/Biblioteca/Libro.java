package org.example.Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private String id;
    private static boolean disponible;
    public static int cantidadLibros = 0;
    public static int librosDisponibles = 0;
    final static String LIB = "LIB";
    private Estudiante estudiantePrestado;
    private Editorial editorial;


    public Libro(String titulo, String autor, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        cantidadLibros++;
        librosDisponibles++;
        disponible = true;
        id = LIB + calcularID(cantidadLibros);
        estudiantePrestado = null;
        this.editorial = editorial;
        editorial.anyadirLibro(this);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getId() {
        return this.id;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }


    @Override
    public String toString() {
        if (estudiantePrestado != null) {
            return "El libro: [" + getTitulo() + " autor " + getAutor() + " id: " + getId() + " disponible " + getDisponible() + "Estudiante " + estudiantePrestado.getNombre() + " Editorial: " + editorial.getNombre() + "]";
        }
        return "El libro: [" + getTitulo() + " autor " + getAutor() + " id: " + getId() + " disponible " + getDisponible() + " Editorial: " + editorial.getNombre() + "]";
    }

    public static String calcularID(int cantidadLibros) {
//        if (Integer.toString(cantidadLibros).length() == 1)
//        {
//            return "LIB00" + cantidadLibros++;
//        }else if (Integer.toString(cantidadLibros).length() == 2){
//            return "LIB0" + cantidadLibros++;
//        }else{
//            return "LIB" +  cantidadLibros++;
//        }
        return String.format("%03d", cantidadLibros);
    }

    public Prestamo prestar(Estudiante estudiante) {
        if (disponible && !estudiante.getLibroPrestados().contains(this)) {
            disponible = false;
            librosDisponibles--;
            System.out.println("El libro " + getTitulo() + " ha sido prestado con exito a " + estudiante.getNombre() + ".");
            estudiantePrestado = estudiante;
            estudiante.anyadirLibro(this);
            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Se ha generado el prestamo " + prestamo);
            return prestamo;
        } else if (estudiante.getLibroPrestados().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene el libro prestado");
        } else {
            System.out.println("El libro " + getTitulo() + " no se puede prestar (no dispo)");

        }
        return null;
    }

//    public Prestamo getPrestamo(Prestamo prestamo){
//        return prestamo;
//    }

    public void devolver(Estudiante estudiante){
        if (!disponible)
        {
            disponible = true;
            librosDisponibles++;
            System.out.println("El libro " + getTitulo() + " ha sido devuelto con exito");
            estudiantePrestado =null;
            estudiante.borrarLibro(this);
        }else{
            System.out.println("El libro  " + getTitulo() + " no ha podido ser devuelto");
        }
    }

    public static int getTotalLibros(){
        return cantidadLibros;
    }

    public int getLibrosDisponibles(){
        return librosDisponibles;
    }

    public static String estaDisponible(){
        if (disponible)
        {
            return "devuelto";
        }
        else{
            return "prestado";
        }
    }



}
