package org.example.RedesSociales;


public class RedSocial {
    public static void main(String[] args) {
        System.out.println("Informacion de la persona");
        Usuario usuario= new Usuario("Ana",30,"@ana",231);
        usuario.mostrarInfo();

        System.out.println();

        Influencer influencer = new Influencer("Luis",25,"@luis_influencer",50000);
        influencer.anyadirColaboradores("Snickers", "Taxi", "Puma");
        influencer.mostrarInfo();

        System.out.println();

        Streamer streamer = new Streamer("Carlos",27,"@carlos_stream",10000000,150,2000);
        streamer.mostrarInfo();

        System.out.println();

        Basico basico = new Basico("Pedro",22,"@pedro123",455);
        basico.mostrarInfo();
    }
}
