package main;

// Importamos vista y controlador
import vista.VentanaPrincipal;
import controlador.Controlador;

public class MainImpuestoVehicular {
    public static void main(String[] args) {
        VentanaPrincipal vista = new VentanaPrincipal();
        new Controlador(vista);
        vista.setVisible(true); //Hacemos la ventana principal visible
    }
}