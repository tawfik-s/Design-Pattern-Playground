package com.tawfeek.builder;

public class Directory {

    public void buildBugatti(CarBuilder carBuilder) {
        carBuilder.brand("Bugatti")
                .color("black");
    }

    public void buildLamborghini(CarBuilder carBuilder) {
        carBuilder.brand("Lamborghini")
                .color("yellow");
    }
}
