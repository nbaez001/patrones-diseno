package com.empresa.proyecto.model;

import com.empresa.proyecto.flyweight.FormatoTexto;

public class Caracter {
    private char simbolo;
    private int posicionX;
    private int posicionY;
    private FormatoTexto formato;

    public Caracter(char simbolo, int posicionX, int posicionY, FormatoTexto formato) {
        this.simbolo = simbolo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.formato = formato;
    }

    public void mostrar() {
        formato.aplicarFormato(simbolo, posicionX, posicionY);
    }
}
