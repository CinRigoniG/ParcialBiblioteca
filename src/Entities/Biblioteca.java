package Entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "publicaciones=" + publicaciones +
                ", usuarios=" + usuarios +
                '}';
    }
}
