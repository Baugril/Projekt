package com.company;

import java.sql.SQLOutput;

public class Car
{
    final String model;
    final String producer;
    Integer yearOfProduction;
    String typeOfFuel;
    String color;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
    void CarStat()
    {
        System.out.println("Posiada model samochodu "+model+" wyprodukowany przez "+ producer+ " w roku "+yearOfProduction+ " o kolorze "+color+" rodzaj paliwa "+typeOfFuel);
    }
}
