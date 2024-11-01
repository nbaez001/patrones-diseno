package com.empresa.proyecto.facade.service;

public class InventarioService {
    public boolean verificarStock(String itemId) {
        System.out.println("Verificando stock para el artículo: " + itemId);
        return true;
    }

    public void reservarArticulo(String itemId) {
        System.out.println("Artículo " + itemId + " reservado en inventario.");
    }
}