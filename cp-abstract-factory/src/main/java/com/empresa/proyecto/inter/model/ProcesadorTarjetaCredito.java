package com.empresa.proyecto.inter.model;

public class ProcesadorTarjetaCredito extends ProcesadorPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
    }
}
