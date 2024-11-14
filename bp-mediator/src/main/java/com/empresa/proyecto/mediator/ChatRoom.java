package com.empresa.proyecto.mediator;

import com.empresa.proyecto.model.Component;
import com.empresa.proyecto.model.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private List<Component> users = new ArrayList<>();

    public void addUser(Component user) {
        user.setMediator(this);
        users.add(user);
    }

    @Override
    public void notify(Component sender, String message) {
        for (Component user : users) {
            if (user != sender) { // Send message to everyone except the sender
                user.receive(sender.getName(), message);
            }
        }
    }
}
