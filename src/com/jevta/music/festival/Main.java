package com.jevta.music.festival;

import java.util.Calendar;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.JANUARY, 1);

       Festival festival = new Festival("Muzicki Festival");

       //Koncerti
       Koncert koncert1 = new Koncert("Rap concert", calendar.getTime(), "Eminem");
       calendar.add(Calendar.DATE, 4);
       Koncert koncert2= new Koncert("Blues concert", calendar.getTime(), "Blues Boys");
       calendar.add(Calendar.DATE, 5);
       Koncert koncert3 = new Koncert("Rock concert", calendar.getTime(), "Slipknot");

       //Takmicenje
       Takmicenje muzickoTakmicenje = new Takmicenje("Muzicko Takmicenje", calendar.getTime());

       //Turnir
       Turnir turnir = new Turnir("Turnir u sposobnosti ucesnika", calendar.getTime());

        //Ucesnici
        Ucesnik ucesnik1 = new Ucesnik("Nenad Jevtic", "muzicar");
        Ucesnik ucesnik2 = new Ucesnik("Jovan Petrovic", "muzicar");
        Ucesnik ucesnik3 = new Ucesnik("Milan Babic", "muzicar");
        Ucesnik ucesnik4 = new Ucesnik("Kristina Bojic", "muzicar");
        Ucesnik ucesnik5 = new Ucesnik("Jovana Ribic", "muzicar");

        Ucesnik ucesnik6 = new Ucesnik("Ilija Jurisic", "gost");
        Ucesnik ucesnik7 = new Ucesnik("Milanka Stojanovic", "gost");
        Ucesnik ucesnik8 = new Ucesnik("Ivan Markovic", "gost");
        Ucesnik ucesnik9 = new Ucesnik("Nikola Vukovic", "gost");
        Ucesnik ucesnik10 = new Ucesnik("Jovica Brkic", "gost");

        //Dodavanje ucesnika u muzicko takmicenje
        muzickoTakmicenje.dodajUcesnika(ucesnik1);
        muzickoTakmicenje.dodajUcesnika(ucesnik2);
        muzickoTakmicenje.dodajUcesnika(ucesnik3);
        muzickoTakmicenje.dodajUcesnika(ucesnik4);
        muzickoTakmicenje.dodajUcesnika(ucesnik6);

        //Dodavanje svih ucesnika u turnir
        turnir.dodajUcesnika(ucesnik1);
        turnir.dodajUcesnika(ucesnik2);
        turnir.dodajUcesnika(ucesnik3);
        turnir.dodajUcesnika(ucesnik4);
        turnir.dodajUcesnika(ucesnik5);
        turnir.dodajUcesnika(ucesnik6);
        turnir.dodajUcesnika(ucesnik7);
        turnir.dodajUcesnika(ucesnik8);
        turnir.dodajUcesnika(ucesnik9);
        turnir.dodajUcesnika(ucesnik10);

        System.out.println(turnir.odrediPobednika());

        //Dodavanje dogadjaja u Festival
        festival.dodajDogadjaj(koncert1);
        festival.dodajDogadjaj(koncert2);
        festival.dodajDogadjaj(koncert3);
        festival.dodajDogadjaj(turnir);
        festival.dodajDogadjaj(muzickoTakmicenje);

        festival.odrziGlasanje();
        System.out.println(muzickoTakmicenje.getBrojUcesnika());

        System.out.println(koncert1.getBrojGlasova());
        System.out.println(koncert2.getBrojGlasova());
        System.out.println(koncert3.getBrojGlasova());


    }
}
