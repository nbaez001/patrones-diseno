package com.empresa.proyecto.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FormatoTextoFactory {
    private static Map<String, FormatoTexto> mapaFormatos = new HashMap<>();

    public static FormatoTexto obtenerFormatoTexto(String fuente, int tamanio, boolean negrita) {
        String clave = fuente + "-" + tamanio + "-" + negrita;
        if (!mapaFormatos.containsKey(clave)) {
            mapaFormatos.put(clave, new FormatoTexto(fuente, tamanio, negrita));
            System.out.println("Creando nuevo FormatoTexto: " + clave);
        }
        return mapaFormatos.get(clave);
    }
}
