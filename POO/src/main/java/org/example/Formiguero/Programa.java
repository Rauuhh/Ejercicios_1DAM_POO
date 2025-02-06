package org.example;

import java.util.ArrayList;

public class Programa {
    //creo los metodos que necesita programa
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, int temporadas, String director) {
        this.nombre = nombre;
        this.temporadas = temporadas;
        listaEmpleados = new ArrayList<>();
        this.director = new Empleado(director, "director");
        listaInvitados = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public void agregarEmpleado(String nombre, String cargo) {
        //metodo para agregar un empleado al programa, si uno ya es director y le pones que tambien sea director, se le cambiara a pte

        Empleado empleado = new Empleado(nombre, cargo);
        if (empleado.getCargo().equals("director"))
        {
            empleado.setCargo("pte");
        }
        empleado.setDirector(director);
        listaEmpleados.add(empleado);

    }

    public void invitadosTemporada(int temporada) {
        //Metodo que dice los invitados de cada temporada
        System.out.println("Los invitados que han ido a la temporada: " + temporada);
        int contador = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                System.out.println("Nombre: " + invitado.getNombre() + ", de profesión: " + invitado.getProfesion());
                contador++;
            }
        }
        System.out.println("Hay un total de " + contador + "esta temporada");
    }

    public int vecesInvitado(String nombre) {
        //metodo que dice cuantas veces ha sido invitada una persona
        int contador = 0;
        for (Invitado invitado : listaInvitados) {
            if (nombre.equals(invitado.getNombre())){
                contador++;
            }
        }
        return contador;
    }

    public void rastrearInvitado(String nombre) {
        //metodo que nos dice la temporada y el dia que fue el invitado
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                System.out.println("Fecha:" + invitado.getFecha_visita() + " y temporada: " + invitado.getTemporada());
            }
        }
    }

    public boolean buscarInvitado(String nombre) {
        //Mteodo que devuelve si un invitado ha estado en el programa
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public String invitadoAntes(String nombre, Programa otroPrograma){
        //Metodo que nos devuelve que invitado ha estado antes en el programa
        Invitado invitado1 = null;
        Invitado invitado2 = null;
        for (Invitado invitado: listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                invitado1 = invitado;
                break;
            }
        }
        for (Invitado invitado : otroPrograma.getListaInvitados()) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) {
                invitado2 = invitado;
                break;
            }
        }
        if (invitado1 != null && invitado2 != null) {
            if (invitado1.getFecha_visita().isBefore(invitado2.getFecha_visita()))
            {
                return "el invitado " + invitado1 + " estuvo antes";
            } else if (invitado2.getFecha_visita().isBefore(invitado1.getFecha_visita())) {
                return "el invitado " + invitado2 + " estuvo antes";
            }

        }
        return "";
    }

    public void agregarInvitado(String nombre, String profesion, int temporada) {
        //metodo para agregar un invitado
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);

    }


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
