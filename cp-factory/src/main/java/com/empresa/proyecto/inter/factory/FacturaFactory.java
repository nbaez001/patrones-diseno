package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.Comprobante;
import com.empresa.proyecto.inter.model.Factura;

public class FacturaFactory extends ComprobanteFactory {
    @Override
    public Comprobante crearComprobante(String numero, String fecha, double monto) {
        return new Factura(numero, fecha, monto);
    }
}
