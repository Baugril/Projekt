package com.company.devices;

public class Phone extends Device
{

    Double screenSize;
    String os;

    public Phone(String model, String producer, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void turnOn()
    {
        System.out.println("Uruchamianie telefonu");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }
}
