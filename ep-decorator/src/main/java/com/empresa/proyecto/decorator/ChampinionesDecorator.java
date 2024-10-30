package com.empresa.proyecto.decorator;

import com.empresa.proyecto.model.Pizza;

public class ChampinionesDecorator extends PizzaDecorador {
    public ChampinionesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Champiñones";
    }

    @Override
    public double getCosto() {
        return pizza.getCosto() + 1.75;
    }
}