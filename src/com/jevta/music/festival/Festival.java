package com.jevta.music.festival;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.*;

public class Festival {
    private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private List<Dogadjaj> dogadaji = new ArrayList<>();

    private String naziv;

    public Festival(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public boolean dodajDogadjaj(Dogadjaj dogadjaj) {
        if (dogadaji.contains(dogadjaj)) {
            return false;
        }

        dogadaji.add(dogadjaj);
        return true;
    }

    public List<Glasanje> svaDostupnaGlasanja() {
        List<Glasanje> glasanja = new ArrayList<>();
        for (Dogadjaj dogadjaj : dogadaji) {
            if (dogadjaj instanceof Glasanje) {
                glasanja.add((Koncert) dogadjaj);
            }
        }
        return glasanja;
    }

    public void odrziGlasanje() {
        Random random = new Random();
        List<Glasanje> glasanja = svaDostupnaGlasanja();

        for (Ucesnik ucesnik : Takmicenje.getUcesnici()) {
            int brojGlasanja = random.nextInt(glasanja.size());
            Glasanje glasanje = glasanja.get(brojGlasanja);
            glasanje.dodajGlas();
        }
    }

    public void ispisiProgram(String nazivFajla) {}

    public void ispisiRangListe(){}
}
