package com.empresa.proyecto;

import com.empresa.proyecto.model.Editor;
import com.empresa.proyecto.observer.EmailAlertsListener;
import com.empresa.proyecto.observer.LoggingListener;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener(
                "log.txt",
                "Someone has opened the file: %s");
        editor.events.subscribe("open", logger);

        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlerts);

        // Example usage
        editor.openFile("test.txt");
        editor.saveFile();
    }
}
