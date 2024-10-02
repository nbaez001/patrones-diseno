package com.empresa.proyecto;

import com.empresa.proyecto.inter.factory.BoletaFactory;
import com.empresa.proyecto.inter.factory.ComprobanteFactory;
import com.empresa.proyecto.inter.factory.FacturaFactory;
import com.empresa.proyecto.inter.model.Comprobante;

public class App {
    private ComprobanteFactory comprobanteFactory;

    public void initialize(String comprobanteType) {
        if ("Boleta".equalsIgnoreCase(comprobanteType)) {
            comprobanteFactory = new BoletaFactory();
        } else if ("Factura".equalsIgnoreCase(comprobanteType)) {
            comprobanteFactory = new FacturaFactory();
        } else {
            throw new RuntimeException("Error! Unknown comprobante type.");
        }
    }

    public void generateComprobante(String number, String date, double amount) {
        Comprobante comprobante = comprobanteFactory.createComprobante(number, date, amount);
        comprobante.printComprobante();
    }

    public static void main(String[] args) {
        App app = new App();
        app.initialize("Boleta");
        app.generateComprobante("001", "01-10-2024", 500.00);
    }
}