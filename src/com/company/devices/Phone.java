package com.company.devices;

import com.company.creatures.Human;
import com.company.Sallebly;
import java.util.Collection;
import java.util.*;

import static com.company.devices.URL.url;

public class Phone extends Device implements Sallebly  {
    static final String DEFAULT_SERVER_NAME = "192.168.155.0";
    static final String DEFAULT_SERVER_PROTOCOL = "http://";
    static final String DEFAULT_APP_VERSION = "9.13.1";

   public Double screenSize;
    public String os;

    public List<String> listaApek = new ArrayList<>();
    public List<Application> applicationListaApek = new ArrayList<>();

    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);

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
    public void installNewApp(String nazwaApki,Double cenaApki,Human dlaKogo) throws Exception{
        if(dlaKogo.getCash() >= cenaApki)
        {
            if(this.juzZainstalowana(nazwaApki))
            {
                throw new Exception("Już masz zainstalowaną aplikację :"+ nazwaApki+ "na swoim urządzeniu");
            }
            else
            {
                this.applicationListaApek.add(new Application(nazwaApki,DEFAULT_APP_VERSION,cenaApki));
                dlaKogo.setCash(dlaKogo.getCash()-cenaApki);
            }
        }
    }
    public boolean  juzZainstalowana2(Application apka)
    {
        return this.applicationListaApek.contains(apka);
    }
    public  boolean juzZainstalowana(String nazwaApki)
    {
        for (Application apka : this.applicationListaApek)
        {
            if(apka.getNazwa().equals(nazwaApki))
            {
                System.out.println("Aplikacja "+nazwaApki+ " już jest zainstalowana na tym telefonie");
                return true;
            }
        }
        System.out.println("Zainstalowano nową aplikację");
        return false;
    }
    public void darmoweApki()
    {
        System.out.println("Lista darmowych aplikacji ");
        for (Application apka :this.applicationListaApek)
        {
            if(apka.getCena().equals(0.0)) System.out.println("* "+apka);
        }
    }

    public void kosztAplikacji()
    {
        Double koszt =0.0;
        for(Application apki : this.applicationListaApek)
        {
            if(apki.getCena()> 0.0) koszt += apki.getCena();
        }
        System.out.println("Suma wszystkich zainstalowanych aplikajci wynosi "+ koszt+ " zł.");
    }
public void poImieniu()
{
    System.out.println("Alfabetyczna lista aplikacji");
     applicationListaApek.sort(new ApplicationNameComparator());
    for(Application apka : this.applicationListaApek)
    {
        System.out.println(apka);
    }
}
public void poCenie()
{
    System.out.println("Lista aplikacji względem ceny.");
    applicationListaApek.sort(new ApplicationValueComparator());
    for (Application apka: this.applicationListaApek)
    {
        System.out.println(apka);
    }
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

    public void sell(Human seller, Human buyer, Double price,Integer sellerPlace, Integer buyerPlace) {
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

