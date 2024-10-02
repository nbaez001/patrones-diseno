package com.empresa.proyecto.inter.model;

public class Boleta implements Comprobante {
    private String number;
    private String date;
    private double amount;

    public Boleta(String number, String date, double amount) {
        this.number = number;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public void printComprobante() {
        System.out.println("Boleta Comprobante");
        System.out.println("Number: " + number);
        System.out.println("Date: " + date);
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + calculateTax());
    }

    @Override
    public double calculateTax() {
        // Boleta has a lower tax, e.g., 8%
        return amount * 0.08;
    }
}