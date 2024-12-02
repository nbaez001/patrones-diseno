package com.empresa.proyecto.state;

import com.empresa.proyecto.model.Document;

public interface State {
    void publish(Document document);

    void review(Document document);
}