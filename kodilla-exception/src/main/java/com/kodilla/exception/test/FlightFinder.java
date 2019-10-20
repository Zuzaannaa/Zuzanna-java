package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> connections;

    public FlightFinder(Map<String, Boolean> findTheFlight) {
        this.connections = findTheFlight;
    }

    public void findTheFlight(Flight flight) throws RouteNotFoundException {
        if (connections.containsKey(flight.getArrivalAirport())) {
            if (connections.get(flight.getArrivalAirport())) {
                System.out.println("Connection found: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
            } else {
                System.out.println("Connection not found: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
            }
        } else {
            throw new RouteNotFoundException();
        }
    }

}
