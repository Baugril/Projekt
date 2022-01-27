package com.company;

import java.sql.SQLOutput;

public class Car
{
    final String model;
    final String producer;
    Integer yearOfProduction;
    String typeOfFuel;
    String color;
    Double value;

    public Car(String model, String producer, Integer yearOfProduction, String typeOfFuel, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.typeOfFuel = typeOfFuel;
        this.color = color;
        this.value = value;
    }

    void CarStat()
    {
        System.out.println("Posiada model samochodu "+model+" wyprodukowany przez "+ producer+ " w roku "+yearOfProduction+ " o kolorze "+color+" rodzaj paliwa "+typeOfFuel);
    }
}
