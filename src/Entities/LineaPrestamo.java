package Entities;

import java.util.Date;

public class LineaPrestamo {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo() {
    }

    public LineaPrestamo(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return "LineaPrestamo{" +
                "fechaDevolucionEstimada=" + fechaDevolucionEstimada +
                ", ejemplar=" + ejemplar +
                '}';
    }
}
