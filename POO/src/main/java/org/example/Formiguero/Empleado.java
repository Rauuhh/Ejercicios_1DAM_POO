package org.example;

    public class Empleado {
        //Creo las clases que necesita empleado
        private String id;
        private String nombre;
        private String cargo;
        private Empleado director;
        private static int cantidad = 0;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public Empleado getDirector() {
            return director;
        }

        public void asignarDirector(Empleado director) {
            this.director = director;
        }

        public String generarID() {
            //metodo para generar automaticamente una ID a cada empleando que empiece por EP

            return String.format("EP%03d", ++cantidad);

        }

        public String comprobarCargo(String cargo) {
            // metodo para indicarle que si no tiene ninguno de estos cargos le ponga pte

            if (!cargo.equals("director") && !cargo.equals("técnico") && !cargo.equals("presentador") && !cargo.equals("colaborador"))
                return "pte";
            return cargo;

        }

        public Empleado(String nombre, String cargo) {
            this.nombre = nombre;
            this.cargo = comprobarCargo(cargo);
            id = generarID();
            this.director = null;
        }

        public void setDirector(Empleado director) {
            this.director = director;
        }

        public static int getCantidad() {
            // metodo para que te devuelva el numero de empleados
            return cantidad;
        }
        @Override
        public String toString() {
            return "Empleado{" +
                    "id='" + id + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", cargo='" + cargo + '\'' +
                    ", director=" + director;
        }
    }

