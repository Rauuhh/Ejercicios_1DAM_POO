package org.example.Ecommerce;

import java.util.Random;
import java.util.Scanner;


public class Bizum extends  MetodoPago{
    static Random random = new Random();
    static Scanner entrada = new Scanner(System.in);
    private String telefono;
    private int pin;
    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public int getPin() {
        return pin;
    }


    public void setPin(int pin) {
        this.pin = pin;
    }


    @Override
    public String toString() {
        return "Bizum{" + "telefono='" + telefono + '\'' + ", pin=" + pin + '}';
    }


    //Constructor de bizum que tambien nos lleva a validar el bizum
    public Bizum(String telefono) {
        this.telefono=telefono;
        this.pin=generarPin();
        validarBizum(entrada.nextInt());
    }


    //Metodo que genera el pin, tambien lo mostramos en pantalla para poder saber cuando introduzcamos el pin si es correco y no tener que adivinar un random
    public static int generarPin() {
        int pin = random.nextInt(100000,999999);
        System.out.println(pin);
        return pin;
    }
    //Metodo que valide que el numerod e telefono sean 9 digitos y el pin sea el que se nos ha generado
    public void validarBizum(int pin) {
        System.out.println("Validando bizum:");
        if (telefono.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]") & this.pin == pin) {
            System.out.println("Pin correcto");
        } else {
            System.out.println("Error");
            System.exit(33);
        }
    }


    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum.");
    }
}
