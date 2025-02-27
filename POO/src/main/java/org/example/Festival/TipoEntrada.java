package org.example.Festival;

public enum TipoEntrada {
GENERAL(50),PISTA(30),VIP(500);

    public double getPrecio() {
        return precio;
    }

    private double precio;
TipoEntrada(double precio){
    this.precio = precio;
}
}
