package com.tawfeek.abstractfactory;

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
