package com.tawfeek.behavioral.command;

public class Room {
    Command command;

    public Room(){}

    public Room(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
