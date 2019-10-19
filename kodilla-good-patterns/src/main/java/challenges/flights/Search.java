package challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    private Set<Flight> connections;

    public Search(Set<Flight> connections) {
        this.connections = connections;
    }

    public Set<Flight> searchByArrival(String arrivalAirport){
        return connections.stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchByDeparture(String departureAirport){
        return connections.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchWithTransfer(String dep, String transferAirport, String arr){
        Set<Flight> transferFlights = connections.stream()
                .filter(f -> f.getDepartureAirport().equals(dep) && f.getArrivalAirport().equals(transferAirport))
                .collect(Collectors.toSet());
        connections.stream()
                .filter(f -> f.getDepartureAirport().equals(transferAirport) && f.getArrivalAirport().equals(arr))
                .collect(Collectors.toCollection(() -> transferFlights));
        return transferFlights;

    }
}
