package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args)
    {
	  Animal dog = new Pet("pies");
      dog.age = 4;
      dog.name = "Aggro";
      Animal cat = new Pet("kot");
      cat.age = 2;
      cat.name = "Niau Niau";

      //Double dogWeightBeforEating = dog.getWeight();

     /* dog.feed(1.0);
      dog.feed(1.0);
      System.out.println("Po jedzeniu przytyłem "+(dog.getWeight() - dogWeightBeforEating+ "kg"));*/

      dog.takeForWalk();


      Car impala = new Car("Impala","Chevrolet",1967,"Benzyna","Czarny",33000.0);
      Car Ford = new Car("Puma","Ford",1995,"Benzyna","Silver",2000.0);
      Car Ford2 = new Car("Puma","Ford",1995,"Benzyna","Silver",2000.0);
      Car Ford3 = new Car("Pumba","Ford",1995,"Benzyna","Silver",2000.0);

      Human Tom = new Human("Tom","Mighty",12500.0,"Homo Sapiens");
      Tom.pet = dog;


      Tom.getSalary();

      Tom.setSalary(3250.0);
      Tom.setMyCar(impala);
      System.out.println(Ford.equals(Ford2));
      System.out.println(Ford.equals(Ford3));
      System.out.println(Ford == Ford2);
      System.out.println(Ford2 == Ford3);
      System.out.println(dog);
      System.out.println(Tom);
      System.out.println(impala);
      Phone nokia = new Phone("3310","Nokia",1,2.0,"A1");

      Ford.turnOn();
      nokia.turnOn();

      Human top = new Human("Top","Secret",4500.0,"Homo Sapiens");
      top.pet=cat;
      top.setMobile(nokia);
      Tom.pet.sell(top,Tom,1300.0);
      System.out.println(Tom.cash+" zł zostało kupującemu "+top.cash+" zł ma sprzedający.");

      top.setMyCar(Ford3);
      Tom.getMyCar().sell(top,Tom,5000.0);
      System.out.println(Tom.cash+" zł zostało kupującemu "+top.cash+" zł ma sprzedający.");

      top.getMobile().sell(top,Tom,800.0);
      System.out.println(Tom.cash+" zł zostało kupującemu "+top.cash+" zł ma sprzedający.");
      Tom.pet.feed();
      Tom.pet.takeForWalk();








    }
}
