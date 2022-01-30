package com.company.devices;

public class Electric extends Car {
    public Electric(String model, String producer, Integer yearOfProduction, String typeOfFuel, String color, Double value) {
        super(model, producer, yearOfProduction, typeOfFuel, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Trzy dni i dwa rachunki za prąd później.... ");
    }
}
