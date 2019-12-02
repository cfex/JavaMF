package com.jevta.music.festival;

import java.util.Date;

public class Koncert extends Dogadjaj implements Glasanje{
    private String izvodjac;
    private int brojGlasova = 0;

    public Koncert(String naziv, Date vremePocetka, String izvodjac) {
        super(naziv, vremePocetka);
        this.izvodjac = izvodjac;
    }

    public String getIzvodjac() {
        return izvodjac;
    }

    @Override
    public void dodajGlas() {
        this.brojGlasova++;
    }

    @Override
    public int getBrojGlasova() {
        return this.brojGlasova;
    }

    @Override
    public String toString() {
        return this.getNaziv() + " broj glasova: " + this.brojGlasova;
    }
}
