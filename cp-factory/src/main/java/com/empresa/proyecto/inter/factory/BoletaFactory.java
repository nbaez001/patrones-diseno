package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.Boleta;
import com.empresa.proyecto.inter.model.Comprobante;

public class BoletaFactory extends ComprobanteFactory {
    @Override
    public Comprobante createComprobante(String number, String date, double amount) {
        return new Boleta(number, date, amount);
    }
}
