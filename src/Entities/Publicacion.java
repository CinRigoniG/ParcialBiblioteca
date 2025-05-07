package Entities;

import Enums.EstadoEjemplar;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {
    private String titulo;
    private int anio;
    private List<Ejemplar> ejemplar;
    private Genero genero;

    public Publicacion() {
    }

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplar = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public List<Ejemplar> getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(List<Ejemplar> ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", ejemplar=" + ejemplar +
                ", genero=" + genero +
                '}';
    }

    public List<Ejemplar> getEjemplaresDisponibles() {
        List<Ejemplar> ejemplaresDisponibles = new ArrayList<>();
        for (Ejemplar ejemplar : ejemplar) {
            if(ejemplar.estaDisponible()){
                ejemplaresDisponibles.add(ejemplar);
            }
        }
        return ejemplaresDisponibles;
    }
}
