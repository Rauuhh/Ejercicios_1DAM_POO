package org.example.Festival.MutxaAwards;

public class Premio {
    private Categoria categoria;
    private Artista ganador;
    public Premio(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Artista getGanador() {
        return ganador;
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }


    @Override
    public String toString() {
        return "Premio{" + "categoria=" + categoria + ", ganador=" + ganador + '}';
    }

}
