package com.company;

import java.time.LocalDate;

public class Human
{
    String firstName;
    String lastName;
    Animal pet;
    Car myCar;
    private Double salary;
    private LocalDate  accessTime;
    private Double balance;

    public Human()
    {
        this.salary = 4500.0;
        this.accessTime = LocalDate.now();
        this.balance = this.salary;
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

    @Override
    public String toString() {
        return "Nowe wynagrodzenie wynosi : "+salary+" zł.";
    }
}
