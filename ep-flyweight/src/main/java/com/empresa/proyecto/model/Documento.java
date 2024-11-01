package com.empresa.proyecto.model;

import com.empresa.proyecto.flyweight.FormatoTexto;
import com.empresa.proyecto.flyweight.FormatoTextoFactory;

public class Documento {
    private java.util.List<Caracter> caracteres = new java.util.ArrayList<>();

    public void agregarCaracter(char simbolo, int posicionX, int posicionY, String fuente, int tamanio, boolean negrita) {
        FormatoTexto formato = FormatoTextoFactory.obtenerFormatoTexto(fuente, tamanio, negrita);
        Caracter caracter = new Caracter(simbolo, posicionX, posicionY, formato);
        caracteres.add(caracter);
    }

    public void mostrar() {
        for (Caracter caracter : caracteres) {
            caracter.mostrar();
        }
    }
}
