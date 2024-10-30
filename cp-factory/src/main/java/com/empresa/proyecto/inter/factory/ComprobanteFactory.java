package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.Comprobante;

public abstract class ComprobanteFactory {
    public abstract Comprobante crearComprobante(String numero, String fecha, double monto);
}
