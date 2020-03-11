package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    Map<String, List<FlightRepository>> flightFinder = new HashMap<>();

    public List<FlightRepository> findFlightsFrom(String departure) {
        return flightFinder.getOrDefault(departure, Collections.emptyList());
    }

    public List<FlightRepository> findFlightsTo(String arrival) {
        return flightFinder.getOrDefault(arrival, Collections.emptyList());
    }
}
