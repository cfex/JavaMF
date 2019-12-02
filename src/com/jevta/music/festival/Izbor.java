package com.jevta.music.festival;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Izbor extends Takmicenje {
    private List<Ucesnik> izborMuzicara = new ArrayList<>();

    public Izbor(String naziv, Date vremePocetka) {
        super(naziv, vremePocetka);
    }

    @Override
    public boolean dodajUcesnika(Ucesnik ucesnik) {
        if(!izborMuzicara.contains(ucesnik)){
            if(ucesnik.getTipUCesnika().equals("muzicar")){
                izborMuzicara.add(ucesnik);
                return true;
            }
            return false;
        }
        return false;
    }
}
