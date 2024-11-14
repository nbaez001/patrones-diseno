package com.empresa.proyecto.originator;

import com.empresa.proyecto.memento.Memento;
import com.empresa.proyecto.memento.TextEditorMemento;

public class TextEditor implements Originator {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Save the current state in a memento
    @Override
    public Memento save() {
        return new TextEditorMemento(this, text);
    }
}