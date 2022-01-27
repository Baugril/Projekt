package com.company;

import com.company.devices.Car;

import java.time.LocalDate;

public class Human
{
    String firstName;
    String lastName;
    Animal pet;
    private Car myCar;
    private Double salary;
    private LocalDate  accessTime;
    private Double balance;

    public Human()
    {
        this.salary = 4500.0;
        this.accessTime = LocalDate.now();
        this.balance = this.salary;
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

    void humanStat()
    {
        System.out.println(firstName+" "+lastName +" Posiadany samochód i zwierzę to: ");
    }


    void lastSalary()
    {

        System.out.println("Nowe wynagrodzenie wynosi : "+salary+" zł.");
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
