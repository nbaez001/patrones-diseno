package com.empresa.proyecto.inter.model;

public class ProcesadorPayPal extends ProcesadorPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
}
