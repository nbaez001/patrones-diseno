package com.empresa.proyecto.facade.service;

public class PagoService {
    public boolean procesarPago(String detallesPago) {
        System.out.println("Procesando pago con los detalles: " + detallesPago);
        return true;
    }
}