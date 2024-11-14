package com.empresa.proyecto;

import com.empresa.proyecto.memento.Memento;
import com.empresa.proyecto.originator.Originator;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history = new Stack<>();

    public void save(Originator originator) {
        history.push(originator.save());
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().restore();
        }
    }
}