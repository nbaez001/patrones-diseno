package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.ProcesadorPago;
import com.empresa.proyecto.inter.model.ProcesadorTarjetaCredito;
import com.empresa.proyecto.inter.model.ValidacionPago;
import com.empresa.proyecto.inter.model.ValidacionTarjetaCredito;

public class TarjetaCreditoFactory implements PlataformaPagoFactory {

    @Override
    public ProcesadorPago crearProcesadorPago() {
        return new ProcesadorTarjetaCredito();
    }

    @Override
    public ValidacionPago crearValidacionPago() {
        return new ValidacionTarjetaCredito();
    }
}