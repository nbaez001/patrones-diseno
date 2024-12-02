package com.empresa.proyecto.observer;

public class EmailAlertsListener implements EventListener {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        System.out.printf("Sending email to %s: %s%n", email, message.replace("%s", filename));
    }
}
