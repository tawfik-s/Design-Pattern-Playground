package com.tawfeek.behavioral.command;


public class SwitchLightsCommand implements Command{

    private Light light;

    public SwitchLightsCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("Switch lights command");
        light.switchLights();
    }
}
