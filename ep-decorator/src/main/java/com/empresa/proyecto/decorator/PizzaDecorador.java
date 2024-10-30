package com.empresa.proyecto.decorator;

import com.empresa.proyecto.model.Pizza;

public abstract class PizzaDecorador implements Pizza {
    protected Pizza pizza;

    public PizzaDecorador(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion();
    }

    @Override
    public double getCosto() {
        return pizza.getCosto();
    }
}