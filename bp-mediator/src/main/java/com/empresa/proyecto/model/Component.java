package com.empresa.proyecto.model;

import com.empresa.proyecto.mediator.Mediator;

public abstract class Component {
    protected Mediator mediator;
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println(this.name + " is sending a message: " + message);
        mediator.notify(this, message);
    }

    public abstract void receive(String senderName, String message);
}
