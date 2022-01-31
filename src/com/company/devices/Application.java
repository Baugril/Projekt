package com.company.devices;

public class Application implements Comparable<Application> {
    public String nazwa;
    private  String wersja;
    private Double cena;

    public Application(String nazwa, String wersja, Double cena) {
        this.nazwa = nazwa;
        this.wersja = wersja;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getWersja() {
        return wersja;
    }

    public Double getCena() {
        return cena;
    }

    @Override
    public int compareTo(Application otherApplication) {
        return this.nazwa.compareTo(otherApplication.nazwa);
    }

    @Override
    public String toString() {
        return "Aplikacja{" +
                "nazwa='" + nazwa + '\'' +
                ", wersja='" + wersja + '\'' +
                ", cena=" + cena +
                '}';
    }
}
