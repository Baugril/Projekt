package com.company.devices;

import com.company.Human;
import com.company.Sallebly;

public class Phone extends Device implements Sallebly
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
        System.out.println("Ta da da ta da...");
    }
    public void sell (Human seller , Human buyer, Double price)
    {
        if (buyer.getCash()>=price)
        {
            if (seller.getMobile()!= null) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.mobile = seller.mobile;
                seller.mobile = null;
                System.out.println("Kupiłem nowy telefon ");
            }
            else
            {
                System.out.println("Nie stać mnie na ten telefon");
            }
        }
        else
        {
            System.out.println("Ten kanciarz nie ma żadnego telefonu ");
        }

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
