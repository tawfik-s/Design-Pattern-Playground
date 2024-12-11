package com.tawfeek.creational.abstractfactory;

public class AsusManufacturer implements AbstractFactory{

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
