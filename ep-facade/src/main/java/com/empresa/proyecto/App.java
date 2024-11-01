package com.empresa.proyecto;

import com.empresa.proyecto.facade.EcommerceFacade;

public class App {
    public static void main(String[] args) {
        EcommerceFacade ecommerceFacade = new EcommerceFacade();

        ecommerceFacade.realizarPedido("ARTICULO123", "TarjetaDeCredito", "123 Calle Principal");
    }
}
