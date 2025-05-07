package Entities;

import Enums.EstadoEjemplar;

public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;
    private Publicacion publicacion;

    public Ejemplar() {
    }

    public Ejemplar(String codigo, EstadoEjemplar estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", publicacion=" + publicacion +
                '}';
    }

    public boolean estaDisponible(){
        return estado == EstadoEjemplar.DISPONIBLE;
    }
}
