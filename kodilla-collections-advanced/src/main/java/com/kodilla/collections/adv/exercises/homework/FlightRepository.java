package com.kodilla.collections.adv.exercises.homework;


import java.util.*;

public class FlightRepository {

//    List<Flight> flightList = new LinkedList<>();

//   public void addFlight(String departure, String arrival) {
//       Flight flight = new Flight(departure, arrival);
//       flightList.add(flight);
//   }

    Map<String, List<Flight>> flightList = new HashMap<>();

    public void addFlight(String departure, Flight arriving) {
        List<Flight> flights = flightList.getOrDefault(departure, new ArrayList<>());
        flights.add(arriving);
        flightList.put(departure, flights);
    }

//    public List<Flight> getFlightsTable(String departure, Flight arrival) {
//       List<Flight> result = new ArrayList<>();
//       for(Flight allFlights: flightList.getOrDefault(departure, Collections.emptyList())) {
//            if(allFlights.getDeparture().equals(arrival))
//                result.add(allFlights);
//       }
//       return result;
//    }
}
