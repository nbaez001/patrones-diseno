package com.empresa.proyecto.state;

import com.empresa.proyecto.model.Document;

public class PublishedState implements State {
    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }

    @Override
    public void review(Document document) {
        System.out.println("Published documents cannot be reviewed.");
    }
}
