package com.empresa.proyecto.state;

import com.empresa.proyecto.model.Document;

public class DraftState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("Cannot publish a draft. Send it for review first.");
    }

    @Override
    public void review(Document document) {
        System.out.println("Draft is sent for review.");
        document.changeState(new ModerationState());
    }
}