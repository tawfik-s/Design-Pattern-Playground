package com.tawfeek.abstractfactory;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("MSI Monitor assemble");
    }
}
