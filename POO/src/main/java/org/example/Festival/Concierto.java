package org.example.Festival;

public class Concierto {
    public static void main(String[] args) throws EdadMinimaException{




             Asistente a1 = new Asistente("Carlos", 15, TipoEntrada.VIP);
             Artista art1 = new Artista("Dua Lipa", 28, "Pop");


        Organizador o1 = new Organizador("Mosto",19,"El jefe");
        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();
        System.out.println();

        System.out.println("Informacion del organizador:");
        o1.mostrarInfo();

        Persona asistente = new Asistente("pepe",20,TipoEntrada.GENERAL);
        asistente.mostrarInfo();

        Persona[] personas = {
                new Artista("Sofía", 25, "Rock Alternativo"),
                new Asistente("Lucas", 18, TipoEntrada.VIP),
                new Organizador("Martín", 30, "Producción"),
        };

        for (Persona p : personas){
            p.mostrarInfo();
            if (p instanceof Organizable){
                ((Organizable) p).organizarEvento();
            }
        }

        Persona artista = new Artista("Sofía", 25, "Rock Alternativo");
        Persona asistente2 = new Asistente("Lucas", 18, TipoEntrada.VIP);
        Persona organizador = new Organizador("Martín", 30, "Producción");


        mostrarAcceso(artista);      //Accediendo como Artista: Preparando el show.
        mostrarAcceso(asistente2);    //Accediendo como Asistente: Buscando su asiento.
        mostrarAcceso(organizador);  //Accediendo como Organizador: Coordinando el evento.

        
        for (TipoEntrada entrada: TipoEntrada.values()){
            System.out.println("Entrada de tipo " + entrada + " con precio " + entrada.getPrecio());
        }
    }


    public static void mostrarAcceso(Persona persona){
        persona.accederEvento();
    }
}
