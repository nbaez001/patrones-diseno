package com.empresa.proyecto.inter.builder;

public class Director {
    public void construirPCGamer(Builder builder) {
        builder.reiniciar();
        builder.setProcesador("Intel i9");
        builder.setRAM(32);
        builder.setAlmacenamiento(1000);
        builder.setTarjetaGrafica(true);
        builder.setWiFi(true);
    }

    public void construirPCOficina(Builder builder) {
        builder.reiniciar();
        builder.setProcesador("Intel i5");
        builder.setRAM(16);
        builder.setAlmacenamiento(500);
        builder.setTarjetaGrafica(false);
        builder.setWiFi(true);
    }
}
