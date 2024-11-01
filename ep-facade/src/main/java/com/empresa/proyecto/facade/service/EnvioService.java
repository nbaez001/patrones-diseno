package com.empresa.proyecto.facade.service;

public class EnvioService {
    public String crearEnvio(String itemId, String direccion) {
        System.out.println("Creando envío para el artículo: " + itemId + " a la dirección: " + direccion);
        return "ENVIO123";
    }
}