package com.empresa.proyecto.inter.factory;

import com.empresa.proyecto.inter.model.ProcesadorPago;
import com.empresa.proyecto.inter.model.ValidacionPago;

public interface PlataformaPagoFactory {

    ProcesadorPago crearProcesadorPago();

    ValidacionPago crearValidacionPago();
}
