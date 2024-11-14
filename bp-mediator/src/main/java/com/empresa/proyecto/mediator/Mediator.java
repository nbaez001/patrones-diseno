package com.empresa.proyecto.mediator;

import com.empresa.proyecto.model.Component;

public interface Mediator {
    void notify(Component sender, String event);
}
