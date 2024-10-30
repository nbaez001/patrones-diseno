package com.empresa.proyecto;

import com.empresa.proyecto.inter.builder.ComputadoraBuilder;
import com.empresa.proyecto.inter.builder.Director;
import com.empresa.proyecto.inter.builder.ManualBuilder;
import com.empresa.proyecto.inter.model.Computadora;
import com.empresa.proyecto.inter.model.Manual;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        // Construyendo una PC Gamer
        ComputadoraBuilder constructorComputadora = new ComputadoraBuilder();
        director.construirPCGamer(constructorComputadora);
        Computadora pcGamer = constructorComputadora.obtenerProducto();
        System.out.println("PC Gamer construida:\n" + pcGamer);

        // Construyendo un Manual para la misma PC Gamer
        ManualBuilder constructorManual = new ManualBuilder();
        director.construirPCGamer(constructorManual);
        Manual manualPCGamer = constructorManual.obtenerProducto();
        System.out.println("\nManual de la PC Gamer:\n" + manualPCGamer);

        // Construyendo una PC de Oficina
        director.construirPCOficina(constructorComputadora);
        Computadora pcOficina = constructorComputadora.obtenerProducto();
        System.out.println("\nPC de Oficina construida:\n" + pcOficina);

        // Construyendo un Manual para la PC de Oficina
        director.construirPCOficina(constructorManual);
        Manual manualPCOficina = constructorManual.obtenerProducto();
        System.out.println("\nManual de la PC de Oficina:\n" + manualPCOficina);
    }
}
