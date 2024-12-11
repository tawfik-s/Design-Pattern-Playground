package com.tawfeek.creational.prototype;

public class Car extends Vehicle {


    public String speed;

    public Car(){}

    public Car(Car car) {
        super(car);
        this.speed = car.speed;
    }
    @Override
    public Car clone() {
        return new Car(this);
    }
}
