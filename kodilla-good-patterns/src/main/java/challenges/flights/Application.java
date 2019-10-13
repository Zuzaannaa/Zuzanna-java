package challenges.flights;

public class Application {
    public static void main(String[] args){
        FlightsRetriever flightsRetriever = new FlightsRetriever();
        Flights flights = flightsRetriever.retrieve();

        Search search = new Search(flights.getConnections());
        search.searchByArrival("Seattle");
        search.searchByDeparture("Spokane");
        search.searchWithTransfer("Portland", "Spokane", "Seattle");

    }
}
