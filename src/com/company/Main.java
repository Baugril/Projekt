package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Pet("pies");
        dog.age = 4;
        dog.name = "Aggro";
        Animal cat = new Pet("kot");
        cat.age = 2;
        cat.name = "Niau Niau";


        Car impala = new LPG("Impala", "Chevrolet", 1967, "LPG", "Czarny", 3300.0);
        Car Ford = new Diesel("Puma", "Ford", 1995, "Diesel", "Silver", 2320.0);
        Car Suzuki = new Diesel("Rav", "Suzuki", 2010, "Diesel", "Silver", 1780.0);
        Car Toyota = new Electric("7", "Toyota", 2020, "Electric", "Silver", 2000.0);
        Human Tom = new Human(6, "Thomas");
        Human All = new Human(5, "All");
        Tom.setMyCar(Toyota, 0);
        Tom.setMyCar(impala, 1);
        Tom.setMyCar(Suzuki, 2);
        Tom.setMyCar(Ford, 3);
        Tom.setCash(10450.0);
        All.setCash(4000.0);

        Tom.allOfMyCar();

        All.getMyMoney();
        Tom.getMyMoney();
        Tom.howManySpaceIhave();
        Tom.getMyCar(0);
        All.getMyCar(1);
        Toyota.sell(Tom, All, 1450.0, 0, 0);
        Suzuki.sell(Tom, All, 2450.0, 2, 1);
        All.allOfMyCar();
        Toyota.sell(All, Tom, 1320.0, 0, 0);

        System.out.println(Tom.getMyCar(0).ostatniWlasciciel());
        System.out.println("Historia pojazdu: " + Tom.getMyCar(0).sprzedaz());
        System.out.println(Tom.getMyCar(0).ostatniWlascicieldane(All));
        Suzuki.getHistoriaZakupow();


    }
}
