package com.empresa.proyecto.model;

import com.empresa.proyecto.mediator.Mediator;

public class User extends Component {
    public User(String name) {
        super(name);
    }

    @Override
    public void receive(String senderName, String message) {
        System.out.println(senderName + " to " + this.name + ": " + message);
    }
}
