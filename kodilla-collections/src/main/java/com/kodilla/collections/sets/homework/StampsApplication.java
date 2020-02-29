package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Wczasy w mieście", 12.0, 20.0, "Ostempllowany"));
        stamps.add(new Stamp("Zima nad Odrą", 7.4, 15.5, "Nieostemplowany"));
        stamps.add(new Stamp("Królik na łące", 10.0, 14.6, "Ostemplowany"));
        stamps.add(new Stamp("Dziwny znaczek", 6.4, 18.5, "Nieostemplowany"));
        stamps.add(new Stamp("Zima nad Odrą", 7.4, 15.5, "Nieostemplowany"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
