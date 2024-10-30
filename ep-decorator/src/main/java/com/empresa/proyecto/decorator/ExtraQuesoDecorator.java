package com.empresa.proyecto.decorator;

import com.empresa.proyecto.model.Pizza;

public class ExtraQuesoDecorator extends PizzaDecorador {
    public ExtraQuesoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Extra Queso";
    }

    @Override
    public double getCosto() {
        return pizza.getCosto() + 1.50;
    }
}