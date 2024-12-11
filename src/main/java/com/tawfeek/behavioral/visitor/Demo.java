package com.tawfeek.behavioral.visitor;

public class Demo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartVisitorImpl());
    }
}
