package com.empresa.proyecto.model;

public class PurchaseRequest {
    private final double amount;
    private final String description;

    public PurchaseRequest(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
