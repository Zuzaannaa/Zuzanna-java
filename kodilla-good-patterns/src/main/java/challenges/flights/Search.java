package challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Search {

    private Set<Airport> connections;

    public Search(Set<Airport> connections) {
        this.connections = connections;
    }

    public void searchByArrival(String arrivalAirport){
        System.out.println("Arrival City: " + arrivalAirport);
        connections.stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void searchByDeparture(String departureAirport){
        System.out.println("Departure City: " + departureAirport);
        connections.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void searchWithTransfer(String dep, String transferAirport, String arr){
        System.out.println("Departure City: " + dep + " Transfer: " + transferAirport + " Arrival City;" + arr);
        connections.stream()
                .filter(f -> f.getArrivalAirport().equals(arr))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        connections.stream()
                .filter(f -> f.getDepartureAirport().equals(dep))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        for(Airport arrivalAirport : connections){
            for(Airport departureAirport : connections){
                if(arrivalAirport.getArrivalAirport().equals(arr) && departureAirport.getDepartureAirport().equals(dep) && arrivalAirport.getArrivalAirport().equals(transferAirport) && departureAirport.getDepartureAirport().equals(transferAirport)){
                    System.out.println("Arrival" + arrivalAirport);
                    System.out.println("Departure" + departureAirport);
                    System.out.println("Transfer: " + transferAirport);
                }
            }
        }

    }
}
