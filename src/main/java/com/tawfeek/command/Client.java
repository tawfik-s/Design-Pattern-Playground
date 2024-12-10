package com.tawfeek.command;

public class Client {

    public static void main(String[] args) {
        Room room = new Room(new SwitchLightsCommand(new Light()));

        room.executeCommand();
    }
}
