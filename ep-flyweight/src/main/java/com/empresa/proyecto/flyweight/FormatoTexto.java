package com.empresa.proyecto.flyweight;

public class FormatoTexto {
    private String fuente;
    private int tamanio;
    private boolean negrita;

    public FormatoTexto(String fuente, int tamanio, boolean negrita) {
        this.fuente = fuente;
        this.tamanio = tamanio;
        this.negrita = negrita;
    }

    public void aplicarFormato(char caracter, int posicionX, int posicionY) {
        System.out.println("Mostrando carácter '" + caracter + "' con fuente: " + fuente +
                ", tamanio: " + tamanio + ", negrita: " + negrita +
                " en la posición (" + posicionX + ", " + posicionY + ")");
    }
}
