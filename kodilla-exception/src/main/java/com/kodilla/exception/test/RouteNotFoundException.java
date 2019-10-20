package com.kodilla.exception.test;

import java.util.HashMap;

public class RouteNotFoundException extends Exception {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Seattle", "London");
        Flight flight2 = new Flight("Los Angeles", "San Diego");
        Flight flight3 = new Flight("Everett", "Portland");
        Flight flight4 = new Flight("Jackson Hole", "Boise");

        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put(flight1.getArrivalAirport(), true);
        airports.put(flight2.getArrivalAirport(), true);
        airports.put(flight3.getArrivalAirport(), false);
        airports.put(flight4.getArrivalAirport(), true);

        FlightFinder flightFinder = new FlightFinder(airports);

        try {
            flightFinder.findTheFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println();
        }

    }
}
