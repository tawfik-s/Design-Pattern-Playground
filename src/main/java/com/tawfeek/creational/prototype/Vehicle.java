package com.tawfeek.creational.prototype;

public abstract class Vehicle implements Prototype{
    public String brand;
    public String model;
    public String color;


    protected Vehicle(){}
    protected Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();
}
