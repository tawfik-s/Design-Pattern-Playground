package com.tawfeek.prototype;

public class Bus extends Vehicle {


    public String seats;

    public Bus(){}

    public Bus(Bus bus){
        super(bus);
        this.seats = bus.seats;
    }
    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
