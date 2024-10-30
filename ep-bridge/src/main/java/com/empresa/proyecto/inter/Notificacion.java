package com.empresa.proyecto.inter;

public abstract class Notificacion {
    protected Sender sender;

    public Notificacion(Sender sender) {
        this.sender = sender;
    }

    public abstract void notificar(String mensaje);
}