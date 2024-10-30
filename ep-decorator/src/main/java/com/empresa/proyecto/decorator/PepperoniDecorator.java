package com.empresa.proyecto.decorator;

import com.empresa.proyecto.model.Pizza;

public class PepperoniDecorator extends PizzaDecorador {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Pepperoni";
    }

    @Override
    public double getCosto() {
        return pizza.getCosto() + 2.00;
    }
}