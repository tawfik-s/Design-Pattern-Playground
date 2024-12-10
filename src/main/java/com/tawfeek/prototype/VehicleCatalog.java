package com.tawfeek.prototype;


import java.util.HashMap;
import java.util.Map;

//may name it vehicle cache
public class VehicleCatalog {

    private Map<String, Vehicle> vehicles = new HashMap<>();

    public VehicleCatalog() {
        Car car = new Car();
        car.brand = "BMW";
        car.model = "Audi";
        car.color = "red";
        car.speed = "100";
        vehicles.put("Audi", car);

        Bus bus = new Bus();
        bus.brand = "mercedes";
        bus.model = "setra";
        bus.color = "white";
        bus.seats = "40";
        vehicles.put("Mercedes", bus);

    }

    public Vehicle getVehicle(String brand) {
        return (Vehicle) vehicles.get(brand).clone();
    }
}
