package org.example.RedesSociales;

public class Streamer extends Usuario{
    private int numero_retransmisiones;
    private int horas_directos;
    public Streamer(String nombre, int edad, String nombre_usuario, int seguidores, int numero_retransmisiones, int horas_directos) {
        super(nombre, edad, nombre_usuario, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directos = horas_directos;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Informacion del streamer");
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Retransmisiones realizadas: " + numero_retransmisiones);
        System.out.println();
        System.out.println("Horas realizadas: " + horas_directos);
    }
}
