package com.empresa.proyecto.inter.model;

public class Factura implements Comprobante {
    private String number;
    private String date;
    private double amount;

    public Factura(String number, String date, double amount) {
        this.number = number;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public void printComprobante() {
        System.out.println("Factura Comprobante");
        System.out.println("Number: " + number);
        System.out.println("Date: " + date);
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + calculateTax());
    }

    @Override
    public double calculateTax() {
        // Factura has a higher tax, e.g., 18%
        return amount * 0.18;
    }
}
