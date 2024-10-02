package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.Comprobante;

public abstract class ComprobanteFactory {
    public abstract Comprobante createComprobante(String number, String date, double amount);
}
