package org.example.Streaming;

public class PlataformaStreaming {
    public static void main(String[] args) {


        Suscripcion[] planes = {new PlanGratis("Gratsi",0), new PlanBasico("Basico",9.99)};
        for (Suscripcion plan : planes){
            System.out.println();
            plan.mostrarInfo();
            plan.obtenerBeneficios();
            plan.obtenerPeriodoPrueba();
        }
        Suscripcion susc = new PlanGratis("Gratis",0);
    }
}
