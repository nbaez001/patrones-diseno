package com.empresa.proyecto.inter;

public class SenderEmail implements Sender {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}
