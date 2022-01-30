package com.company.devices;

public class Diesel extends Car {
    public Diesel(String model, String producer, Integer yearOfProduction, String typeOfFuel, String color, Double value) {
        super(model, producer, yearOfProduction, typeOfFuel, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Nie zapomij mnie tankujesz Diselem !!! ");
    }
}
