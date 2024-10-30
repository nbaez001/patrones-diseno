package com.empresa.proyecto.inter.model;

public class ValidacionPayPal extends ValidacionPago {
    @Override
    public boolean validar(String datosPago) {
        System.out.println("Validando cuenta PayPal...");
        return datosPago.contains("@");
    }
}
