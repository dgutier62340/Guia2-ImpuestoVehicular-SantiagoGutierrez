package modelo;

public class CalculadoraImpuestos {
    public static double calcular(Vehiculo vehiculo) {
        double impuestoBase = vehiculo.getAvaluo() * 0.015; // 1.5% del avalúo
        if (vehiculo.getTipoUso().equalsIgnoreCase("Publico")) {
            impuestoBase *= 0.8; // Descuento para transporte público
        }
        return impuestoBase;
    }
}