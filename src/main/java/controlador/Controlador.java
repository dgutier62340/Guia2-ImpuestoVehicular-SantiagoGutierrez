package controlador;

import modelo.CalculadoraImpuestos;
import modelo.Vehiculo;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener { //ImplementamosListener para escuchar eventos
    private VentanaPrincipal vista;

    public Controlador(VentanaPrincipal vista) {
        this.vista = vista;
        this.vista.btnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //Escuchamos el evento del boton calcular
        if (e.getSource() == vista.btnCalcular) {
            calcularImpuesto();
        }
    }

    private void calcularImpuesto() {
        try {
            // Obtener datos de la vista
            String marca = vista.txtMarca.getText();
            String modelo = vista.txtModelo.getText();
            int anio = Integer.parseInt(vista.txtAnio.getText());
            int cilindraje = Integer.parseInt(vista.txtCilindraje.getText());
            double avaluo = Double.parseDouble(vista.txtAvaluo.getText());
            String tipoUso = (String) vista.ComboTipoUso.getSelectedItem();

            // Crear objeto Vehiculo
            Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, cilindraje, avaluo, tipoUso);

            // Calcular impuesto
            double impuesto = CalculadoraImpuestos.calcular(vehiculo);

            // Mostrar resultado en la vista
            vista.lblResultado.setText("Impuesto: $" + impuesto);
        } catch (NumberFormatException ex) {
            vista.lblResultado.setText("Error: Verifique los datos ingresados");
        }
    }
}
