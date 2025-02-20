package org.example.Streaming;

public class PlanBasico extends Suscripcion{
    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido de en calidad estandar sin anuncios");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Sin periodo de prueba");
    }
}
