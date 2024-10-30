package com.empresa.proyecto.inter;

import com.empresa.proyecto.model.Archivo;
import com.empresa.proyecto.model.Directorio;

public class GestorSistemaArchivos {
    private Directorio directorioRaiz;

    public void cargarSistemaArchivos() {
        directorioRaiz = new Directorio("Raíz");
        directorioRaiz.agregar(new Archivo("Documento.docx", 20000));
        directorioRaiz.agregar(new Archivo("Imagen.png", 150000));

        Directorio media = new Directorio("Media");
        media.agregar(new Archivo("Video.mp4", 2000000));
        directorioRaiz.agregar(media);
    }

    public void mostrarSistemaArchivos() {
        directorioRaiz.mostrarDetalles();
        System.out.println("Tamaño total del Directorio Raíz: " + directorioRaiz.obtenerTamanio() + " bytes");
    }
}
