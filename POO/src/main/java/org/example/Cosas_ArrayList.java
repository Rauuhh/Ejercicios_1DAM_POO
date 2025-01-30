package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Cosas_ArrayList {
    public static void main (String[] args)
    {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(3);
        listaNumeros.add(14);
        listaNumeros.add(45);
        listaNumeros.add(1,9);
        System.out.println(listaNumeros.get(0));
        listaNumeros.remove(0);
        listaNumeros.remove(Integer.valueOf(45));
        System.out.println("Posicion del numero 14: " + listaNumeros.indexOf(14));
        System.out.println("Posicion del numero 45: " + listaNumeros.indexOf(45));
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
        for (int lista : listaNumeros){
            System.out.println(lista);
        }
        listaNumeros.set(0,56);
        System.out.println(listaNumeros.get(0));
        Object lista_copia = listaNumeros.clone();

        listaNumeros.clear();
        System.out.println(listaNumeros);
        if (listaNumeros.contains(56))
        {
            System.out.println("Esta en la lista");
        }else{
        System.out.println("No esta en la lista");
    }
        if (listaNumeros.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista no esta vacia");
        }
        listaNumeros.addAll(Arrays.asList(2,5,9,12,33));
        System.out.println(listaNumeros);

    }
    public static void insertarVarios(ArrayList<Integer>lista,Integer...  numeros){
        lista.addAll(Arrays.asList(numeros));
    }
}
