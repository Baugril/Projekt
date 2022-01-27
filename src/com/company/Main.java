package com.company;

public class Main {

    public static void main(String[] args)
    {
	  Animal dog = new Animal("pies");
      dog.age = 4;
      dog.name = "Aggro";
      Animal cat = new Animal("kot");
      cat.age = 2;
      cat.name = "Niau Niau";

      Double dogWeightBeforEating = dog.getWeight();

      dog.animalStat();


     /* dog.feed(1.0);
      dog.feed(1.0);
      System.out.println("Po jedzeniu przytyłem "+(dog.getWeight() - dogWeightBeforEating+ "kg"));

      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();
      dog.takeForWalk();

      dog.feed(2.0);
      cat.animalStat();
      cat.feed(1.0);
      cat.feed(1.0);
      cat.takeForWalk();
      cat.takeForWalk();
      cat.takeForWalk();
      cat.takeForWalk();
      cat.feed(1.0);
      cat.takeForWalk();*/

      Car impala = new Car("Impala","Chevrolet");
      impala.typeOfFuel ="Benzyna";
      impala.color = "Czarnym";
      impala.yearOfProduction= 1967;

      Human Tom = new Human();
      Tom.firstName = "Tom";
      Tom.lastName = "Mighty";
      Tom.pet = dog;
      Tom.myCar = impala;
      Tom.humanStat();
      impala.CarStat();
      dog.animalStat();
      Tom.getSalary();

      Tom.setSalary(3150.0);
      System.out.println(Tom);





    }
}
