package com.empresa.proyecto.inter.builder;

import com.empresa.proyecto.inter.model.Manual;

public class ManualBuilder implements Builder {
    private Manual manual;

    public ManualBuilder() {
        this.reiniciar();
    }

    @Override
    public void reiniciar() {
        this.manual = new Manual();
    }

    @Override
    public void setProcesador(String procesador) {
        this.manual.setDetallesProcesador("Esta computadora tiene un procesador " + procesador + ".");
    }

    @Override
    public void setRAM(int RAM) {
        this.manual.setDetallesRAM("La computadora tiene " + RAM + "GB de RAM.");
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        this.manual.setDetallesAlmacenamiento("La computadora cuenta con " + almacenamiento + "GB de almacenamiento.");
    }

    @Override
    public void setTarjetaGrafica(boolean tieneTarjetaGrafica) {
        this.manual.setDetallesTarjetaGrafica(tieneTarjetaGrafica ? "La computadora incluye una tarjeta gráfica." : "No tiene tarjeta gráfica dedicada.");
    }

    @Override
    public void setWiFi(boolean tieneWiFi) {
        this.manual.setDetallesWiFi(tieneWiFi ? "La computadora tiene WiFi integrado." : "No tiene WiFi disponible.");
    }

    public Manual obtenerProducto() {
        Manual producto = this.manual;
        this.reiniciar();
        return producto;
    }
}
