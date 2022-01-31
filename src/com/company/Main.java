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


        Car impala = new LPG("Impala", "Chevrolet", 1967, "LPG", "Czarny", 33000.0);
        Car Ford = new Diesel("Ford", "Ford", 1995, "Diesel", "Silver", 23200.0);
        Car Suzuki = new Diesel("Suzuki", "Ford", 2010, "Diesel", "Silver", 17800.0);
        Car Toyota = new Electric("Toyota", "Ford", 2020, "Electric", "Silver", 2000.0);
        Human Tom = new Human(4, "Thomas");
        Tom.setMyCar(Toyota, 0);
        Tom.setMyCar(Suzuki, 1);
        Tom.setMyCar(impala, 2);
        Tom.setCash(10450.0);
        Human All = new Human(4, "All");
        All.setCash(4000.0);
        All.setMyCar(Ford, 1);

        Tom.allOfMyCar();
        Tom.getMyMoney();
        impala.sell(Tom, All, 2500.0, 2, 2);
        All.allOfMyCar();
        Tom.allOfMyCar();
        All.getMyMoney();
        All.weClean();
        Tom.getMyMoney();
        Tom.howManySpaceIhave();


    }
}
