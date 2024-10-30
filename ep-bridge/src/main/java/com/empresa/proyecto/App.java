package com.empresa.proyecto;

import com.empresa.proyecto.inter.*;

public class App {
    public static void main(String[] args) {
        Sender smsSender = new SenderSms();
        Sender emailSender = new SenderEmail();

        Notificacion notificacionSmsNormal = new NotificacionNormal(smsSender);
        Notificacion notificacionEmailUrgente = new NotificacionUrgente(emailSender);

        System.out.println("Probando Notificación Normal por SMS:");
        notificacionSmsNormal.notificar("Reunión a las 10 AM");

        System.out.println("\nProbando Notificación Urgente por Email:");
        notificacionEmailUrgente.notificar("¡El servidor está caído!");
    }
}
