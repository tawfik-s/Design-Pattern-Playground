package com.tawfeek.creational.abstractfactory;

public class MsiManufacturer implements AbstractFactory{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
