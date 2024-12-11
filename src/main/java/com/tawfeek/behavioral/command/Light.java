package com.tawfeek.behavioral.command;

public class Light {

    boolean on;
    public Light() {
        on = false;
    }
    public Light(boolean on) {
        this.on = on;
    }
    public void switchLights() {
        System.out.println("from "+on+" to "+!on);
        on = !on;
    }
}
