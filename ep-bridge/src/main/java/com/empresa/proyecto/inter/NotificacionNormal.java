package com.empresa.proyecto.inter;

public class NotificacionNormal extends Notificacion {

    public NotificacionNormal(Sender sender) {
        super(sender);
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación Normal:");
        sender.enviar(mensaje);
    }
}
