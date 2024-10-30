package com.empresa.proyecto.inter.model;

public class Computadora {
    private String procesador;
    private int RAM;
    private int almacenamiento;
    private boolean tieneTarjetaGrafica;
    private boolean tieneWiFi;

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setTarjetaGrafica(boolean tieneTarjetaGrafica) {
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    public void setWiFi(boolean tieneWiFi) {
        this.tieneWiFi = tieneWiFi;
    }

    @Override
    public String toString() {
        return "Computadora [procesador=" + procesador + ", RAM=" + RAM + "GB, almacenamiento=" + almacenamiento + "GB, tarjetaGrafica=" + (tieneTarjetaGrafica ? "Sí" : "No") + ", WiFi=" + (tieneWiFi ? "Sí" : "No") + "]";
    }
}
