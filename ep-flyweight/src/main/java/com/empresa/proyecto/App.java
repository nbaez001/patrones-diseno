package com.empresa.proyecto;

import com.empresa.proyecto.model.Documento;

public class App {
    public static void main(String[] args) {
        Documento documento = new Documento();

        // Agregar caracteres con formato compartido utilizando el patrón Flyweight
        documento.agregarCaracter('H', 0, 0, "Arial", 12, true);
        documento.agregarCaracter('e', 10, 0, "Arial", 12, true);
        documento.agregarCaracter('l', 20, 0, "Arial", 12, true);
        documento.agregarCaracter('l', 30, 0, "Arial", 12, true);
        documento.agregarCaracter('o', 40, 0, "Arial", 12, true);

        // Agregar una línea con un formato diferente
        documento.agregarCaracter('M', 0, 20, "Times New Roman", 14, false);
        documento.agregarCaracter('u', 10, 20, "Times New Roman", 14, false);
        documento.agregarCaracter('n', 20, 20, "Times New Roman", 14, false);
        documento.agregarCaracter('d', 30, 20, "Times New Roman", 14, false);
        documento.agregarCaracter('o', 40, 20, "Times New Roman", 14, false);

        // Mostrar todos los caracteres en el documento
        documento.mostrar();
    }
}
