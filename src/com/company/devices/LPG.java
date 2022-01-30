package com.company.devices;

public class LPG extends Car {
    public LPG(String model, String producer, Integer yearOfProduction, String typeOfFuel, String color, Double value) {
        super(model, producer, yearOfProduction, typeOfFuel, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Samochód został zatankowany.");
    }
}
