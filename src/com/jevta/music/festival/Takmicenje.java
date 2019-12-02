package com.jevta.music.festival;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Takmicenje extends Dogadjaj {
    private int brojUcesnika = 0;
    private static List<Ucesnik> ucesnici = new ArrayList<>();

    public Takmicenje(String naziv, Date vremePocetka) {
        super(naziv, vremePocetka);
    }

    public boolean dodajUcesnika(Ucesnik ucesnik) {
        ucesnici.add(ucesnik);
        this.brojUcesnika++;
        return true;
    }

    public static List<Ucesnik> getUcesnici() {
        return ucesnici;
    }

    public int getBrojUcesnika() {
        return brojUcesnika;
    }

    @Override
    public String toString() {
        return this.getNaziv() + " broj ucesnika: " + this.getBrojUcesnika();
    }
}
