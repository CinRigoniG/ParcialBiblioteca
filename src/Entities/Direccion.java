package Entities;

public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;
    private String codigoPostal;

    public Direccion() {
    }

    public Direccion(String calle, int numero, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
