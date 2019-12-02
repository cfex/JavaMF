package com.jevta.music.festival;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Turnir extends Takmicenje {
    private ArrayList<Ucesnik> ucesniciTurnira = new ArrayList<>();

    public Turnir(String naziv, Date vremePocetka) {
        super(naziv, vremePocetka);
    }

    @Override
    public boolean dodajUcesnika(Ucesnik ucesnik) {
        if (ucesniciTurnira.contains(ucesnik)) {
            return false;
        }

        ucesniciTurnira.add(ucesnik);
        return true;
    }

    public Ucesnik odrediPobednika(){
        Random random = new Random();
        int randomIndex = random.nextInt(ucesniciTurnira.size());
        return ucesniciTurnira.get(randomIndex);
    }
}
