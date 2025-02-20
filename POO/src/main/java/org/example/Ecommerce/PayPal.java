package org.example.Ecommerce;

import java.util.Scanner;


public class PayPal extends MetodoPago{
    static Scanner entrada = new Scanner(System.in);


    //clase final donde si no introducimos saldo siempre sera 23
    final double saldoPre = 23;
    private String cuenta;
    private double saldo;


    //Constructor donde si introducimos saldo
    public PayPal(String cuenta, double saldo) {
        this.saldo=saldo;
        this.cuenta=cuenta;
    }
    //Construxtor donde no introducimos saldo
    public PayPal(String cuenta) {
        this.cuenta=cuenta;
        this.saldo= saldoPre;
    }




    // Metodo que valida que el formato del correo sea correcto y que el importe a pagar sea menor o igual que el saldo que tenemos
    private boolean validarPayPal(String cuenta, double importe) {
        System.out.println("Validando cuenta:");
        if (cuenta.matches(".*@*.com") && importe <= saldo) {
            return true;
        }
        System.out.println("Datos incorrectos o saldo insuficiente.");
        return false;
    }




    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal");
        if (validarPayPal(this.cuenta, importe)) {
            System.out.println("Pago aceptado.");
        }
    }


    @Override
    public String toString() {
        return "PayPal: cuenta: " + cuenta + ", saldo: " + saldo;
    }


}

