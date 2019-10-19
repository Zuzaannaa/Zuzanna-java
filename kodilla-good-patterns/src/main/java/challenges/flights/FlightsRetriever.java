package challenges.flights;

public class FlightsRetriever {
    public Flights retrieve(){
        Flight flight1 = new Flight("Seattle", "Portland");
        Flight flight2 = new Flight("Spokane", "Seattle");
        Flight flight3 = new Flight("Portland", "Seattle");
        Flight flight4 = new Flight("Yakima", "Portland");
        Flight flight5 = new Flight("San Diego", "Portland");
        Flight flight6 = new Flight("Portland", "Spokane");
        Flight flight7 = new Flight("Yakima", "Spokane");

        Flights flights = new Flights();
        flights.addConnection(flight1);
        flights.addConnection(flight2);
        flights.addConnection(flight3);
        flights.addConnection(flight4);
        flights.addConnection(flight5);
        flights.addConnection(flight6);
        flights.addConnection(flight7);

        return flights;
    }
}
