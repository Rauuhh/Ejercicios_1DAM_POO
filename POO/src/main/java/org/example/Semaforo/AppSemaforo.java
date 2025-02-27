package org.example.Semaforo;

public class AppSemaforo {
    public static void main(String[] args) {
        int contador = 0;
        do
        {
                for (Semaforo semaforo : Semaforo.values()) {
                    if (contador < 10) {
                    System.out.println(semaforo);
                    contador++;
                }
            }
        }while (contador < 10);
    }
}
