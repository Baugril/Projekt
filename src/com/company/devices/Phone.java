package com.company.devices;

import com.company.creatures.Human;
import com.company.Sallebly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.company.devices.URL.url;

public class Phone extends Device implements Sallebly {
    static final String DEFAULT_SERVER_NAME = "192.168.155.0";
    static final String DEFAULT_SERVER_PROTOCOL = "http://";
    static final String DEFAULT_APP_VERSION = "9.13.1";

    Double screenSize;
    String os;

    public List<String> listaApek = new ArrayList<>();

    public Phone(String model, String producer, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void installAnnApp(String nazwaApki) {
        url.add("https://www.samsung.com/pl/one-ui/");
        listaApek.add(nazwaApki);
        System.out.println("Aplikacja " + nazwaApki + " w wersji " + DEFAULT_APP_VERSION + " została zainstalowana na Twoim telefonie z serwera :" + DEFAULT_SERVER_NAME + " przez protokół " + DEFAULT_SERVER_PROTOCOL);

    }

    public void installAnnApp(String nazwaApki, String domyslaWersja) {
        listaApek.add(nazwaApki);

        System.out.println("Aplikacja " + nazwaApki + " w wersji " + domyslaWersja + " została zainstalowana na Twoim telefonie z serwera :" + DEFAULT_SERVER_NAME + " przez protokół " + DEFAULT_SERVER_PROTOCOL);
        url.add("https://play.google.com/store/apps/details?id=com.mcontrol.calendar");

    }

    public void installAnnApp(String nazwaApki, String domyslaWersja, String adresSerwera) {
        listaApek.add(nazwaApki);
        System.out.println("Aplikacja " + nazwaApki + " w wersji " + domyslaWersja + " została zainstalowana na Twoim telefonie z serwera :" + adresSerwera);
        url.add(adresSerwera);

    }

    public void installAnnApp(List<String> listaApek) {
        System.out.println("Zainstalowano " + listaApek + " z serwera :" + url);
    }


    public void turnOn() {
        System.out.println("Ta da da ta da...");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            if (seller.getMobile() != null) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.mobile = seller.mobile;
                seller.mobile = null;
                System.out.println("Kupiłem nowy telefon ");
            } else {
                System.out.println("Nie stać mnie na ten telefon");
            }
        } else {
            System.out.println("Ten kanciarz nie ma żadnego telefonu ");
        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }
}
