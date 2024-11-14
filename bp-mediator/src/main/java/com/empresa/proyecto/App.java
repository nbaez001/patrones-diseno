package com.empresa.proyecto;

import com.empresa.proyecto.mediator.ChatRoom;
import com.empresa.proyecto.model.Component;
import com.empresa.proyecto.model.User;

public class App {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Component user1 = new User("Alice");
        Component user2 = new User("Bob");
        Component user3 = new User("Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello, everyone!");
        user2.send("Hi Alice!");
        user3.send("Good morning!");
    }
}
