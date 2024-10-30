package com.empresa.proyecto.inter;

public class NotificacionUrgente extends Notificacion {

    public NotificacionUrgente(Sender sender) {
        super(sender);
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación Urgente:");
        sender.enviar("[URGENTE] " + mensaje);
    }
}