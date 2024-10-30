package com.empresa.proyecto.model;

import java.util.ArrayList;
import java.util.List;

public class Directorio implements ElementoArchivo {
    private String nombre;
    private List<ElementoArchivo> hijos;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public void agregar(ElementoArchivo hijo) {
        hijos.add(hijo);
    }

    public void eliminar(ElementoArchivo hijo) {
        hijos.remove(hijo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Directorio: " + nombre);
        for (ElementoArchivo hijo : hijos) {
            hijo.mostrarDetalles();
        }
    }

    @Override
    public long obtenerTamanio() {
        long tamanioTotal = 0;
        for (ElementoArchivo hijo : hijos) {
            tamanioTotal += hijo.obtenerTamanio();
        }
        return tamanioTotal;
    }
}