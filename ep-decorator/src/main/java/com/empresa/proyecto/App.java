package com.empresa.proyecto;

import com.empresa.proyecto.decorator.ChampinionesDecorator;
import com.empresa.proyecto.decorator.ExtraQuesoDecorator;
import com.empresa.proyecto.decorator.PepperoniDecorator;
import com.empresa.proyecto.model.Pizza;
import com.empresa.proyecto.model.PizzaMargarita;

public class App {
    public static void main(String[] args) {
        Pizza miPizza = new PizzaMargarita();

        // Agregados
        miPizza = new ExtraQuesoDecorator(miPizza);
        miPizza = new PepperoniDecorator(miPizza);
        miPizza = new ChampinionesDecorator(miPizza);

        System.out.println("Descripción de la pizza: " + miPizza.getDescripcion());
        System.out.println("Costo total: $" + miPizza.getCosto());
    }
}
