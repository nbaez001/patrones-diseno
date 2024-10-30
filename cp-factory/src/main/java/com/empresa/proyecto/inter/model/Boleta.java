package com.empresa.proyecto.inter.model;

public class Boleta implements Comprobante {
    private String numero;
    private String fecha;
    private double monto;

    public Boleta(String numero, String fecha, double monto) {
        this.numero = numero;
        this.fecha = fecha;
        this.monto = monto;
    }

    @Override
    public void imprimirComprobante() {
        System.out.println("Boleta Comprobante");
        System.out.println("Number: " + numero);
        System.out.println("Date: " + fecha);
        System.out.println("Amount: " + monto);
        System.out.println("Tax: " + calcularImpuesto());
    }

    @Override
    public double calcularImpuesto() {
        return monto * 0.08;
    }
}