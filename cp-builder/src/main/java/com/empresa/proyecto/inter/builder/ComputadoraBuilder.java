package com.empresa.proyecto.inter.builder;

import com.empresa.proyecto.inter.model.Computadora;

public class ComputadoraBuilder implements Builder {
    private Computadora computadora;

    public ComputadoraBuilder() {
        this.reiniciar();
    }

    @Override
    public void reiniciar() {
        this.computadora = new Computadora();
    }

    @Override
    public void setProcesador(String procesador) {
        this.computadora.setProcesador(procesador);
    }

    @Override
    public void setRAM(int RAM) {
        this.computadora.setRAM(RAM);
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        this.computadora.setAlmacenamiento(almacenamiento);
    }

    @Override
    public void setTarjetaGrafica(boolean tieneTarjetaGrafica) {
        this.computadora.setTarjetaGrafica(tieneTarjetaGrafica);
    }

    @Override
    public void setWiFi(boolean tieneWiFi) {
        this.computadora.setWiFi(tieneWiFi);
    }

    public Computadora obtenerProducto() {
        Computadora producto = this.computadora;
        this.reiniciar();
        return producto;
    }
}
