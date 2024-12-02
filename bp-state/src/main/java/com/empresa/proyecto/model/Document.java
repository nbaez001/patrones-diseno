package com.empresa.proyecto.model;

import com.empresa.proyecto.state.DraftState;
import com.empresa.proyecto.state.State;

public class Document {
    private State state;

    public Document() {
        this.state = new DraftState(); // Initial state
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }

    public void review() {
        state.review(this);
    }
}
