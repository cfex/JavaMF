package com.jevta.music.festival;

public class Ucesnik implements Glasanje, Comparable<Ucesnik> {
    private String ime;
    private int brojGlasova;
    private TipUcesnika tipUCesnika;

    public Ucesnik(String ime, String tipUcesnika) {
        this.ime = ime;
        if(tipUcesnika == "gost"){
            this.tipUCesnika = TipUcesnika.GOST;
        }else if(tipUcesnika == "muzicar") {
            this.tipUCesnika = TipUcesnika.MUZICAR;
        }
    }

    public String getIme() {
        return ime;
    }

    public TipUcesnika getTipUCesnika() {
        return tipUCesnika;
    }

    public boolean isEqual(Ucesnik otherUcesnik) {
        if (this.ime.equals(otherUcesnik.getIme())) {
            return this.tipUCesnika.equals(otherUcesnik.getTipUCesnika());
        }
        return false;
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
    public int compareTo(Ucesnik otherUcesnik) {
        if (brojGlasova > otherUcesnik.getBrojGlasova()) {
            return -1;
        } else if (brojGlasova == otherUcesnik.getBrojGlasova()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return this.ime;
    }
}
