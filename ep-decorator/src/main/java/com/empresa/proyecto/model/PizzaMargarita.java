package com.empresa.proyecto.model;

public class PizzaMargarita implements Pizza {
    @Override
    public String getDescripcion() {
        return "Pizza Margarita";
    }

    @Override
    public double getCosto() {
        return 8.00;
    }
}