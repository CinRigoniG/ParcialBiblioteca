import Entities.*;
import Enums.EstadoEjemplar;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Harry Potter", 2004, "sjfiejfik");
        Genero fantasia = new Genero("Fantasia", "Fantasia");
        Editorial editorial = new Editorial("Editorial", "Editorial");
        Direccion direccionEditorial = new Direccion("Calle", 123, "Mensoza", "1234");
        editorial.setDireccion(direccionEditorial);
        Autor autor1 = new Autor("Vanina", "argentina", new Date(1992,05,27));
        Autor autor2 = new Autor("Nair", "argentina", new Date(1989,04,25));

        libro.getAutores().add(autor1);
        libro.getAutores().add(autor2);

        libro.setGenero(fantasia);
        libro.setEditorial(editorial);

        Ejemplar ejemplar = new Ejemplar("codigo", EstadoEjemplar.DISPONIBLE);
        Ejemplar ejemplar1 = new Ejemplar("codigo", EstadoEjemplar.PRESTADO);

        libro.getEjemplar().add(ejemplar);
        libro.getEjemplar().add(ejemplar1);

        Revista revista = new Revista("Paparazzi", 2025, 2, 25);

        Ejemplar ejemplar2 = new Ejemplar("codigo", EstadoEjemplar.DISPONIBLE);

        revista.getEjemplar().add(ejemplar2);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.getPublicaciones().add(libro);
        biblioteca.getPublicaciones().add(revista);

        Usuario usuario = new Usuario("Cinthia", "Rigoni", "cinthia@gmail.com");

        biblioteca.getUsuarios().add(usuario);

        Prestamo prestamo = new Prestamo(new Date(2025,04,20), new Date(2025,04,30));
        prestamo.agregarLineaPrestamo(ejemplar);

    }
}