package org.example.Formiguero;

public class Empleado {
    final static String EP = "EP";
    public static int cantidadEmpleados = 0;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo){
        id = EP + calcularID(cantidadEmpleados);
        cantidadEmpleados++;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public static void setCantidadEmpleados(int cantidadEmpleados) {
        Empleado.cantidadEmpleados = cantidadEmpleados;
    }

    public static String calcularID(int cantidadEmpleados) {

        return String.format("%03d", cantidadEmpleados);
    }

}

