package com.empresa.proyecto;

import com.empresa.proyecto.memento.Memento;
import com.empresa.proyecto.originator.Originator;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> mementos = new Stack<>();

    public void save(Originator originator) {
        mementos.push(originator.save());
    }

    public void undo() {
        if (!mementos.isEmpty()) {
            mementos.pop().restore();
        }
    }
}