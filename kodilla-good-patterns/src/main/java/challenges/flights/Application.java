package challenges.flights;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args){
        FlightsRetriever flightsRetriever = new FlightsRetriever();
        Flights flights = flightsRetriever.retrieve();

        Search search = new Search(flights.getConnections());
        System.out.println("Flights to Seattle: " + search.searchByArrival("Seattle"));
        System.out.println("Flights from Spokane: " + search.searchByDeparture("Spokane"));
        System.out.println("Flights from Portland to Seattle through Spokane: " + search.searchWithTransfer("Portland", "Spokane" , "Seattle"));

    }
}
