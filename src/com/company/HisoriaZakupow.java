package com.company;

import com.company.creatures.Human;

import java.time.LocalDate;

public class HisoriaZakupow
{
    private Human buyer;
    private Human seller;
    private Double price;
    private LocalDate accesTime;

    public HisoriaZakupow(Human buyer, Human seller, Double price) {
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        this.accesTime = LocalDate.now();
    }

    public Human getBuyer() {
        return buyer;
    }

    public Human getSeller() {
        return seller;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getAccesTime() {
        return accesTime;
    }

    @Override
    public String toString() {
        return "HistoriaPojazdu{" +
                "Kupujący : =" + buyer +
                "Sprzedający :=" + seller +
                "Kwota :=" + price +
                "Dnia :" + accesTime +
                '}';
    }
}
