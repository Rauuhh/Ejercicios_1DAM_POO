package org.example.Ecommerce;

public class TarjetaCredito extends MetodoPago{


    @Override
    public String toString() {
        return "TarjetaCredito{" + "nro_tarjeta='" + nro_tarjeta + '\'' + ", tipo='" + tipo + '\'' + '}';
    }


    private String nro_tarjeta;
    private String tipo;


    //Constructor y validacion de tarjeta
    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta=nro_tarjeta;
        this.tipo=tipo;
        validarTarjeta(nro_tarjeta, tipo);
    }


    //Metodo que nos valida la longitud de la tarjeta y el tipo de la tarjeta
    private void validarTarjeta(String nro_tarjeta, String tipo) {
        System.out.println("Validando tarjeta:");
        if (nro_tarjeta.matches("\\d{16}") && (tipo.equalsIgnoreCase("VISA") || tipo.equalsIgnoreCase("MASTERCARD") || tipo.equalsIgnoreCase("MAESTRO"))) {
            return;
        }
        System.out.println("Los datos de tu tarjeta no son correctos.");
        System.exit(33);
    }




    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito" + tipo);
    }
}

