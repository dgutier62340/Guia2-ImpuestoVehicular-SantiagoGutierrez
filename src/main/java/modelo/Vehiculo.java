package modelo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int cilindraje;
    private double avaluo;
    private String tipoUso; // "particular" o "publico"

    public Vehiculo(String marca, String modelo, int año, int cilindraje, double avaluo, String tipoUso) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.cilindraje = cilindraje;
        this.avaluo = avaluo;
        this.tipoUso = tipoUso;
    }

    // Getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public double getAvaluo() {
        return avaluo;
    }
    public String getTipoUso() {
        return tipoUso;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }
    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }
}
