package com.empresa.proyecto.inter;

public class SenderSms implements Sender {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
