package com.company.devices;

public class Phone
{
    String producer;
    String model;
    Double screenSize;
    String os;


    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }
}
