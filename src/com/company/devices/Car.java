package com.company.devices;

import com.company.Sallebly;
import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.company.HisoriaZakupow;

public abstract class Car extends Device implements Sallebly {


    String typeOfFuel;
    String color;
    public Double value;
    public List<Human> listaWlascicieli;
    public List<HisoriaZakupow> historiaZakupow;


    public Car(String model, String producer, Integer yearOfProduction, String typeOfFuel, String color, Double value) {
        super(model, producer, yearOfProduction);
        this.typeOfFuel = typeOfFuel;
        this.color = color;
        this.value = value;
        this.listaWlascicieli = new ArrayList<>();
        this.historiaZakupow = new ArrayList<>();

    }


    public void turnOn() {
        System.out.println("Pyrpyrpyrpyr khłe khłe..");
    }

    public String ostatniWlascicieldane(Human name) {


        String czyTak = "Dane zweryfikowane";

        if (this.listaWlascicieli.contains(name)) {
            System.out.println("To był ostatni właściciel tego pojazdu");
        } else if (!this.listaWlascicieli.contains(name)) {
            System.out.println("To nie był ostatni właściciele tego pojazdu");
        }


        return czyTak;
    }

    public int sprzedaz() {
        return (this.listaWlascicieli.size());
    }

    public void getHistoriaZakupow() {
        System.out.println(historiaZakupow);
    }


    public void sell(Human seller, Human buyer, Double price, Integer sellerPlace, Integer buyerPlace) {
        if (seller.getMyCar(sellerPlace) != null) {
            int buyerPosition = buyer.howManySpaceIhave();
            if (buyerPosition < 0) throw new IllegalArgumentException("Nie posiadasz wystarczająco miejsca na to auto");
            else if (buyer.getCash() >= price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.carBuyer(buyerPlace, seller.getMyCar(sellerPlace));
                seller.carSeller(sellerPlace);
                buyer.getMyCar(buyerPosition).historiaZakupow.add(new HisoriaZakupow(buyer, seller, price));
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

    public Human ostatniWlasciciel() {
        return this.listaWlascicieli.get(this.listaWlascicieli.size() - 1);
    }


    @Override
    public int hashCode() {
        return Objects.hash(model, producer, yearOfProduction, typeOfFuel, color, value);
    }

    @Override
    public String toString() {
        return "Samochód = " +
                ", model :='" + model + '\'' +
                ", producent : ='" + producer + '\'' +
                ", kolor :='" + color + '\'' +
                ", wartość :=" + value +
                " typ : ='" + typeOfFuel + '\'' +
                ", rok produkcji :=" + yearOfProduction +
                '}';
    }
}
