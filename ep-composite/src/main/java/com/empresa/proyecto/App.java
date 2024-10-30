package com.empresa.proyecto;

import com.empresa.proyecto.inter.GestorSistemaArchivos;

public class App {
    public static void main(String[] args) {
        GestorSistemaArchivos gestor = new GestorSistemaArchivos();

        gestor.cargarSistemaArchivos();
        gestor.mostrarSistemaArchivos();
    }
}
