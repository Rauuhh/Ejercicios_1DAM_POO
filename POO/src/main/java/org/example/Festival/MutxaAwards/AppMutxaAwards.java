package org.example.Festival.MutxaAwards;

public class AppMutxaAwards {
    public static void main(String[] args) {

        Presentador presentador1 = new Presentador("Roberto Leal");
        Artista artista1 = new Artista("Javier Bardem");
        Artista artista2 = new Artista("Antonio Banderas");
        Artista artista3 = new Artista("Maxi Iglesias");
        Artista artista4 = new Artista("Úrsula Corberó");
        Artista artista5 = new Artista("Hiba Abouk");

        System.out.println(presentador1);
        System.out.println("---------------------");
        presentador1.alfombraRoja();
        artista1.alfombraRoja();
        artista2.alfombraRoja();
        artista3.alfombraRoja();
        artista4.alfombraRoja();
        artista5.alfombraRoja();
        System.out.println("-----------------------");
        presentador1.aplaudir();
        artista1.aplaudir();
        artista2.aplaudir();
        artista3.aplaudir();
        artista4.aplaudir();
        artista5.aplaudir();
        System.out.println("-----------------------");
        presentador1.presentar();
        presentador1.darDiscurso("El presentador da un discurso para solidarizarse con los afectados de la dana");
        System.out.println("-----------------------");
        Premio premio = new Premio(Categoria.MEJOR_ACTOR);
        System.out.println("Introduciendo premio " + premio.getCategoria());
        System.out.println("-----------------------");
        artista1.esNominado(premio.getCategoria());
        artista3.esNominado(premio.getCategoria());
        artista2.esNominado(premio.getCategoria());
        artista5.esNominado(premio.getCategoria());
        System.out.println("-----------------------");
        System.out.println(artista2.getNombre() + " ha ganado el premio " + premio.getCategoria());
        premio.setGanador(artista2);
        presentador1.aplaudir();
        artista1.celebrarPremio(premio);
        artista3.celebrarPremio(premio);
        artista4.celebrarPremio(premio);
        artista5.celebrarPremio(premio);
        System.out.println("-----------------------");
artista2.recogerPremio(premio);
presentador1.entregarPremio(premio);
artista2.darDiscurso("El artista " + premio.getGanador() + " esta dando un discurso sobre el esfuerzp realizado para rodar la pelicula");
        System.out.println("-----------------------");
        presentador1.darDiscurso("El presentador da un discurso para despedir la gala");
        presentador1.darDiscurso("Introducimos la siguiente pelicula");
        Premio premio2 = new Premio(Categoria.MEJOR_PELICULA);
        artista1.esNominado(premio2.getCategoria());
        artista3.esNominado(premio2.getCategoria());
        artista2.esNominado(premio2.getCategoria());
        artista5.esNominado(premio2.getCategoria());
        premio2.setGanador(artista2);
        presentador1.aplaudir();
        artista1.celebrarPremio(premio2);
        artista3.celebrarPremio(premio2);
        artista4.celebrarPremio(premio2);
        artista5.celebrarPremio(premio2);
        artista2.recogerPremio(premio2);
        presentador1.entregarPremio(premio2);
        artista2.darDiscurso("El artista " + premio2.getGanador() + " esta dando un discurso SOBRE LO DIFICIL QUE HA SIDO CONSEGUIR LA FINANCIACION");
        artista1.obtenerDetalles();
        artista2.obtenerDetalles();
        artista3.obtenerDetalles();
        artista4.obtenerDetalles();
        artista5.obtenerDetalles();

    }
}
