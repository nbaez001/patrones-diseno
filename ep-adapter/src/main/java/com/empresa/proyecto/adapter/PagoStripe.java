package com.empresa.proyecto.adapter;

public class PagoStripe {
    public void realizarPago(double montoEnCentavos) {
        System.out.println("Procesando pago de $" + (montoEnCentavos / 100) + " a través de Stripe.");
    }
}
