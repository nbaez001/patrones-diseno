package com.empresa.proyecto.state;

import com.empresa.proyecto.model.Document;

public class ModerationState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("Document is approved and published.");
        document.changeState(new PublishedState());
    }

    @Override
    public void review(Document document) {
        System.out.println("Document is already under review.");
    }
}
