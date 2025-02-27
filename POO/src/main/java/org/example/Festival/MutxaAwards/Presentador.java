package org.example.Festival.MutxaAwards;

public class Presentador extends MutxaAwards implements AccionesAsistentes{
    private String nombre;

    public Presentador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Presentador: " + nombre ;
    }

    public void presentar(){
        System.out.println("El presentador " + nombre + " esta presentando la gala");
    }

    public void entregarPremio(Premio premio){
        System.out.println("El presentador " +nombre + " esta entregando el premio" + premio.getCategoria() + " a " + premio.getGanador().getNombre() );
    }

    @Override
    public void aplaudir() {
        System.out.println("El Presentador " + nombre + " aplaudiendo... PLAS PLAS PLAS");

    }

    @Override
    public void alfombraRoja() {
        System.out.println ("Presentador " + nombre + " pasando por la alfombra roja");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println(tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El presentador " + nombre + "esta celebrando el premio " + premio.getCategoria() + " otorgado a" );
    }
}
