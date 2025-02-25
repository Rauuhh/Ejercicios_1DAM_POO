package org.example.Festival;

class Asistente extends Persona {
    protected String entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, TipoEntrada entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = String.valueOf(entrada);
    }

    public void prueba(){}

    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }
    public void accederEvento(){
        System.out.println("Accediendo como asistente: Buscando su asiento");
    }
}