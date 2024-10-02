package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.Comprobante;
import com.empresa.proyecto.inter.model.Factura;

public class FacturaFactory extends ComprobanteFactory {
    @Override
    public Comprobante createComprobante(String number, String date, double amount) {
        return new Factura(number, date, amount);
    }
}
