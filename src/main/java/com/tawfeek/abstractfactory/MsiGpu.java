package com.tawfeek.abstractfactory;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {

        System.out.println("MSI Gpu assemble");
    }
}
