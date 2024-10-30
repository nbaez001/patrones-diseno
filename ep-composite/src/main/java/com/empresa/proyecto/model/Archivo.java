package com.empresa.proyecto.model;

public class Archivo implements ElementoArchivo {
    private String nombre;
    private long tamanio;

    public Archivo(String nombre, long tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Archivo: " + nombre + ", Tamaño: " + tamanio + " bytes");
    }

    @Override
    public long obtenerTamanio() {
        return tamanio;
    }
}