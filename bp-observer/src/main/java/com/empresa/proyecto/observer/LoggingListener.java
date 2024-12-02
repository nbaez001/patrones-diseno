package com.empresa.proyecto.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    @Override
    public void update(String filename) {
        try (FileWriter writer = new FileWriter(log, true)) {
            writer.write(message.replace("%s", filename) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
