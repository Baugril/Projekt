package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDate;

public class Human extends Animal
{

    String firstName;
    String lastName;
    public Animal pet;
    private Car myCar;
    private Double salary;
    private LocalDate  accessTime;
    private Double balance;
    public Double cash;
    public Phone mobile;

    public Human(String firstName, String lastName, Double cash,String species)
    {
        super(species);
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.salary = 4500.0;
        this.accessTime = LocalDate.now();
        this.balance = this.salary;
        this.pet = null;
        this.myCar = null;
        this.mobile = null;
    }


    public Phone getMobile()
    {
        return mobile;
    }

    public void setMobile(Phone mobile)
    {
        this.mobile = mobile;
    }

    public Car getMyCar()
    {
        return myCar;
    }

    public void setMyCar(Car myCar)
    {
       if (this.salary > myCar.value)
       {
           System.out.println("Udało Ci się kupić auto za gotówkę");
           this.myCar =myCar;
       }
       else if (this.salary > (myCar.value / 12))
       {
           System.out.println("Udało się kupić auto na kredyt.");
           this.myCar = myCar;
       }
       else
       {
           System.out.println("Potrzebiujesz podwyżki lub zmień pracę ,żeby było Cie stać na to auto");
       }
    }

    public void getSalary()
    {
        System.out.println(accessTime+" Wynagrodzenie wynosiło : "+balance+ " zł.");
    }

    public void setSalary(Double salary)
    {
        if (salary <= 0)
        {
            System.out.println("Nie można dokonać ujemnej wpłaty");
        }
        else
        {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Proszę odebrać aneks u Pani Hani z kadr");
            System.out.println("ZUS i US zostały poinformowane o zmianie w wynagrodzeniu.");
            this.salary = salary;
        }
    }

    void lastSalary()
    {

        System.out.println("Nowe wynagrodzenie wynosi : "+salary+" zł.");
    }

    public Double getCash()
    {
        return cash;
    }

    public void setCash(Double cash)
    {
        this.cash = cash;
    }
    public void carBuyer(Car forMe)
    {
        this.myCar = forMe;
    }
    public void carSeller()
    {
        this.myCar = null;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", myCar=" + myCar +
                ", salary=" + salary +
                ", accessTime=" + accessTime +
                ", balance=" + balance +
                '}';
    }
}
