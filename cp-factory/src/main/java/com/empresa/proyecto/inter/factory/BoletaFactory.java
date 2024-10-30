package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.Boleta;
import com.empresa.proyecto.inter.model.Comprobante;

public class BoletaFactory extends ComprobanteFactory {
    @Override
    public Comprobante crearComprobante(String numero, String fecha, double monto) {
        return new Boleta(numero, fecha, monto);
    }
}
