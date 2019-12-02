package com.jevta.music.festival;

import java.util.Date;

public abstract class Dogadjaj implements Comparable{
    private String naziv;
    private Date vremePocetka;

    public Dogadjaj(String naziv, Date vremePocetka) {
        this.naziv = naziv;
        this.vremePocetka = vremePocetka;
    }

    public String getNaziv() {
        return naziv;
    }

    public Date getVremePocetka() {
        return vremePocetka;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
