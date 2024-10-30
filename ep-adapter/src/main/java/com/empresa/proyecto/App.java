package com.empresa.proyecto;

import com.empresa.proyecto.adapter.AdaptadorStripe;
import com.empresa.proyecto.adapter.PagoStripe;
import com.empresa.proyecto.model.PagoPayPal;

public class App {
    public static void main(String[] args) {
        PagoPayPal pagoPayPal = new PagoPayPal();
        PagoStripe pagoStripe = new PagoStripe();
        PagoPayPal adaptadorStripe = new AdaptadorStripe(pagoStripe);

        procesarPago(pagoPayPal, 50.0);
        procesarPago(adaptadorStripe, 75.0);
    }

    public static void procesarPago(PagoPayPal metodoPago, double monto) {
        metodoPago.pagar(monto);
    }
}
