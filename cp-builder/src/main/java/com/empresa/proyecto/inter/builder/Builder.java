package com.empresa.proyecto.inter.builder;

public interface Builder {
    void reiniciar();
    void setProcesador(String procesador);
    void setRAM(int RAM);
    void setAlmacenamiento(int almacenamiento);
    void setTarjetaGrafica(boolean tieneTarjetaGrafica);
    void setWiFi(boolean tieneWiFi);
}