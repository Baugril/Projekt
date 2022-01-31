package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDate;
import java.util.Arrays;

public class Human {

    String firstName;
    String lastName;
    public Animal pet;
    private Double salary;
    private LocalDate accessTime;
    private Double balance;
    public Double cash;
    public Phone mobile;
    private Car[] garage;
    private final Integer size;

    public void newHumanConstructor() {
        this.salary = 4500.0;
        this.accessTime = LocalDate.now();
        this.balance = this.salary;
        this.pet = null;
        this.mobile = null;
        this.garageForNewCar();
        this.garage = new Car[this.size];

    }

    private void garageForNewCar() {
        this.garage = new Car[this.size];
    }

    public Human() {

        this.size = 4;
        this.newHumanConstructor();
    }

    public Human(Integer size, String firstName) {
        this.size = size;
        this.newHumanConstructor();
        this.firstName = firstName;
    }


    public Phone getMobile() {
        return mobile;
    }

    public void setMobile(Phone mobile) {
        this.mobile = mobile;
    }

    public Car getMyCar(Integer placeForCar) {
        if (placeForCar >= 0 && placeForCar < this.size) {
            return this.garage[placeForCar];
        } else {
            throw new IllegalArgumentException("Nie posiadasz takiego miejsca w garażu");
        }
    }

    public void setMyCar(Car myCar, Integer place) {
        if (place >= 0 && place < this.size) {
            if (this.salary > myCar.value) {
                this.garage[place] = myCar;
                System.out.println("Udało Ci się kupić auto za gotówkę");
                this.garage[place].listaWlascicieli.add(this);
            } else if (this.salary > (myCar.value / 12)) {
                this.garage[place] = myCar;
                System.out.println("Udało się kupić auto na kredyt.");
                this.garage[place].listaWlascicieli.add(this);


            } else {
                System.out.println("Potrzebiujesz podwyżki lub zmień pracę ,żeby było Cie stać na to auto");
            }

        } else throw new IllegalArgumentException("Nie posiadasz takiego miejsca w garażu");

    }


    public void getSalary() {
        System.out.println(accessTime + " Wynagrodzenie wynosiło : " + balance + " zł.");
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Nie można dokonać ujemnej wpłaty");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Proszę odebrać aneks u Pani Hani z kadr");
            System.out.println("ZUS i US zostały poinformowane o zmianie w wynagrodzeniu.");
            this.salary = salary;
        }
    }

    public void getMyMoney() {
        Double MyMoney = 0.0;
        for (int i = 0; i < this.size; i++) {
            if (this.garage[i] != null) MyMoney += this.garage[i].value;
        }
        if (MyMoney > 0) {
            System.out.println("Wartość wszystkich samochodów wynosi :" + MyMoney + " zł.");
        } else if (MyMoney <= 0) {
            System.out.println("Właściel nie posiada żadnych pojazdów w garażu");
        }
    }

    public int howManySpaceIhave() {
        int parkingPlace = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.garage[i] == null) {
                parkingPlace = i;
                break;
            }
        }
        System.out.println("Liczba zajętych miejsc parkingowych przez samochody właściciela " + firstName + " wynosi :" + parkingPlace);
        return parkingPlace;
    }

    void lastSalary() {

        System.out.println("Nowe wynagrodzenie wynosi : " + salary + " zł.");
    }

    public void weClean() {
        Arrays.sort(this.garage, (myCar1, myCar2) ->
        {
            Integer check1 = (myCar1 == null) ? Integer.MAX_VALUE : myCar1.yearOfProduction;
            Integer check2 = (myCar2 == null) ? Integer.MAX_VALUE : myCar2.yearOfProduction;
            return (check1.compareTo(check2));

        });
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void allOfMyCar() {
        for (Car myCar : this.garage) {
            if (myCar != null) {
                System.out.println(firstName + " Posiada zaparkowany samochód :" + myCar);
            }
        }
    }


    public void carBuyer(Integer place, Car forMe) {
        this.garage[place] = forMe;
    }

    public void carSeller(Integer place) {
        this.garage[place] = null;
    }

    @Override
    public String toString() {
        return "Ostatni właściciel samochodu:{" +
                "Imie: '" + firstName + '\'' +
                ", dnia : " + accessTime +
                ", za : " + cash +
                ", kupił samochody: " + Arrays.toString(garage) +
                ", Jego wielkość garażu wynosi : " + size +
                '}';
    }
}
