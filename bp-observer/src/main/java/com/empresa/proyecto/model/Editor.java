package com.empresa.proyecto.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Saving file content...");
        }
        events.notify("save", file.getName());
    }
}
