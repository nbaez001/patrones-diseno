package com.empresa.proyecto.inter.model;

public class ValidacionTarjetaCredito extends ValidacionPago {
    @Override
    public boolean validar(String datosPago) {
        System.out.println("Validando datos de tarjeta de crédito...");
        return datosPago.length() == 16;
    }
}
