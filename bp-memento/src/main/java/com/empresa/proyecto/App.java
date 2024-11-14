package com.empresa.proyecto;

import com.empresa.proyecto.originator.TextEditor;

public class App {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setText("Hello");
        caretaker.save(textEditor);

        textEditor.setText("Hello, World!");
        caretaker.save(textEditor);

        textEditor.setText("Hello, World! Undo in progress...");
        System.out.println("Current Text: " + textEditor.getText()); // Output: Hello, World! Undo in progress...

        caretaker.undo();
        System.out.println("After undo: " + textEditor.getText()); // Output: Hello, World!

        caretaker.undo();
        System.out.println("After second undo: " + textEditor.getText()); // Output: Hello
    }
}
