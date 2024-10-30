package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.ProcesadorPago;
import com.empresa.proyecto.inter.model.ProcesadorPayPal;
import com.empresa.proyecto.inter.model.ValidacionPago;
import com.empresa.proyecto.inter.model.ValidacionPayPal;

public class PayPalFactory implements PlataformaPagoFactory {
    @Override
    public ProcesadorPago crearProcesadorPago() {
        return new ProcesadorPayPal();
    }

    @Override
    public ValidacionPago crearValidacionPago() {
        return new ValidacionPayPal();
    }
}
