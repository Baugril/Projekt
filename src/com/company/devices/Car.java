package com.company.devices;

import com.company.Human;
import com.company.Sallebly;

import java.util.Objects;

public class Car extends Device
{


    String typeOfFuel;
    String color;
    public Double value;

    public Car(String model, String producer, Integer yearOfProduction, String typeOfFuel, String color, Double value) {
        super(model, producer, yearOfProduction);
        this.typeOfFuel = typeOfFuel;
        this.color = color;
        this.value = value;
    }

   public void turnOn()
   {
       System.out.println("Pyrpyrpyrpyr khłe khłe..");
   }

 public void sell (Human seller,Human buyer,Double price)
  {
      if (seller.getMyCar()!= null)
      {
          if (buyer.getCash() >= price)
          {
              buyer.setCash(buyer.getCash()-price);
              seller.setCash(seller.getCash() + price);
              buyer.carBuyer(seller.getMyCar());
              seller.carSeller();
              System.out.println("Mam ten kloc, mam teen klooooc -> znaczy się autko");
          }
          else
          {
              System.out.println("Brakło kaski ;(");
          }
      }
      else
      {
          System.out.println("Hej zaraz Ty wcale nie masz auta !!!");
      }
  }

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
                "typeOfFuel='" + typeOfFuel + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
