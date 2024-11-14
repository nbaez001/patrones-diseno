package com.empresa.proyecto.memento;

import com.empresa.proyecto.originator.TextEditor;

public class TextEditorMemento implements Memento {
    private final TextEditor originator;
    private final String text;

    public TextEditorMemento(TextEditor originator, String text) {
        this.originator = originator;
        this.text = text;
    }

    @Override
    public void restore() {
        originator.setText(text);
    }
}