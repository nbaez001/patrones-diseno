package com.empresa.proyecto.adapter;

import com.empresa.proyecto.model.PagoPayPal;

public class AdaptadorStripe extends PagoPayPal {
    private PagoStripe pagoStripe;

    public AdaptadorStripe(PagoStripe pagoStripe) {
        this.pagoStripe = pagoStripe;
    }

    @Override
    public void pagar(double monto) {
        double montoEnCentavos = monto * 100;
        pagoStripe.realizarPago(montoEnCentavos);
    }
}
