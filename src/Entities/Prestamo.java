package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private List<LineaPrestamo> lineas;

    public Prestamo() {
    }

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = new ArrayList<>();
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public List<LineaPrestamo> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaPrestamo> lineas) {
        this.lineas = lineas;
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LineaPrestamo lineaPrestamo = new LineaPrestamo(new Date());
        lineaPrestamo.setEjemplar(ejemplar);
        lineas.add(lineaPrestamo);
    }

    @Override
    public String toString(){
        return "Fecha préstamo: " + this.fechaPrestamo
                + "\nFecha devolucion: " + this.fechaDevolucion
                + "\nLineas: " + this.lineas;
    }
}
