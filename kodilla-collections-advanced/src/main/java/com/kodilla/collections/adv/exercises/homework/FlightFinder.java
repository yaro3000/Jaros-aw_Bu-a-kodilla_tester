package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> departures = new ArrayList<>();
        for (Flight flight : flightRepository.flightList.(departure, Collections.emptyList())) {
            departures.add(flight);
        }
        return departures;
    }

    public List<Flight> findFlightsTo(String arrival) {
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> arrivals = new ArrayList<>();
        for (Flight flight : flightRepository.flightList.getOrDefault(arrival, Collections.emptyList())) {
            arrivals.add(flight);
        }
        return arrivals;
    }
}
