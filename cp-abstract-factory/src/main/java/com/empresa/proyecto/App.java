package com.empresa.proyecto;

import com.empresa.proyecto.inter.factory.PayPalFactory;
import com.empresa.proyecto.inter.factory.PlataformaPagoFactory;
import com.empresa.proyecto.inter.factory.TarjetaCreditoFactory;
import com.empresa.proyecto.inter.model.ProcesadorPago;
import com.empresa.proyecto.inter.model.ValidacionPago;

public class App {

    public static void main(String[] args) {
        String metodoPago = "TarjetaCredito";
        String datosPago = "1234567812345678";
        double monto = 100.0;

        PlataformaPagoFactory factory;

        if (metodoPago.equals("TarjetaCredito")) {
            factory = new TarjetaCreditoFactory();
        } else if (metodoPago.equals("PayPal")) {
            factory = new PayPalFactory();
        } else {
            throw new IllegalArgumentException("Método de pago desconocido.");
        }

        ProcesadorPago procesador = factory.crearProcesadorPago();
        ValidacionPago validacion = factory.crearValidacionPago();

        if (validacion.validar(datosPago)) {
            procesador.procesarPago(monto);
        } else {
            System.out.println("Validación fallida. No se puede procesar el pago.");
        }
    }
}
