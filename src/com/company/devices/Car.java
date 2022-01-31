package com.company.devices;

import com.company.Sallebly;
import com.company.creatures.Human;

import java.util.Objects;

public abstract class Car extends Device implements Sallebly {


    String typeOfFuel;
    String color;
    public Double value;

    public Car(String model, String producer, Integer yearOfProduction, String typeOfFuel, String color, Double value) {
        super(model, producer, yearOfProduction);
        this.typeOfFuel = typeOfFuel;
        this.color = color;
        this.value = value;

    }

    public void turnOn() {
        System.out.println("Pyrpyrpyrpyr khłe khłe..");
    }

    public void sell(Human seller, Human buyer, Double price, Integer sellerPlace, Integer buyerPlace) {
        if (seller.getMyCar(sellerPlace) != null) {
            int buyerPosition = buyer.howManySpaceIhave();
            if (buyerPosition < 0) throw new IllegalArgumentException("Nie posiadasz wystarczająco miejsca na to auto");
            if (buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.carBuyer(buyerPlace, seller.getMyCar(sellerPlace));
                seller.carSeller(sellerPlace);
                System.out.println("Mam ten kloc, mam teen klooooc -> znaczy się autko");
            } else {
                throw new IllegalArgumentException("Brakło kaski ;(");
            }
        } else {
            throw new IllegalArgumentException("Hej zaraz Ty wcale nie masz auta !!!");
        }
    }

    public abstract void refuel();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer) && yearOfProduction.equals(car.yearOfProduction) && typeOfFuel.equals(car.typeOfFuel) && color.equals(car.color) && value.equals(car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, yearOfProduction, typeOfFuel, color, value);
    }

    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                "typeOfFuel='" + typeOfFuel + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
