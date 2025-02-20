package org.example.Pokemon;

public class AppPokedex {
    public static void main(String[] args) {
        Electrico pikachu = new Electrico(100,100);
        pikachu.atacar();

        Agua squirtle = new Agua(200,100);
        squirtle.atacar();

        squirtle.imprimirDatos();

        Pokemon pikachu2 = new Electrico(30,21);
        pikachu2.atacar();
        Pokemon squirtle2 = new Agua(30,21);
        squirtle2.atacar();

        Pokemon[] pokemons = {new Electrico(30,21), new Agua(200,100) };
        for (Pokemon pokemon : pokemons){
            pokemon.atacar();
            pokemon.imprimirDatos();

            if (pokemon instanceof Agua){
                ((AtaquesAgua) pokemon).pistolaAgua();
                ((Agua) pokemon).hidrobomba();
                ((Agua) pokemon).surf();
                ((Agua) pokemon).pistolaAgua();
                ((Agua) pokemon).salpicadura();

            }
        }
    }
}
