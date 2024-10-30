package com.empresa.proyecto.inter;

public abstract class Tarjeta {
    private String titular;
    private String numero;
    private String fechaExpiracion;

    // Constructor normal.
    public Tarjeta() {
    }

    public Tarjeta(Tarjeta source) {
        if (source != null) {
            this.titular = source.titular;
            this.numero = source.numero;
            this.fechaExpiracion = source.fechaExpiracion;
        }
    }

    public abstract Tarjeta clonar();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Fecha de Expiración: " + fechaExpiracion);
    }
}