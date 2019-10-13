package challenges.flights;

public class FlightsRetriever {
    public Flights retrieve(){
        Airport airport1 = new Airport("Seattle", "Portland");
        Airport airport2 = new Airport("Spokane", "Seattle");
        Airport airport3 = new Airport("Portland", "Seattle");
        Airport airport4 = new Airport("Yakima", "Portland");
        Airport airport5 = new Airport("San Diego", "Portland");
        Airport airport6 = new Airport("Portland", "San Diego");
        Airport airport7 = new Airport("Yakima", "Spokane");

        Flights flights = new Flights();
        flights.addConnection(airport1);
        flights.addConnection(airport2);
        flights.addConnection(airport3);
        flights.addConnection(airport4);
        flights.addConnection(airport5);
        flights.addConnection(airport6);
        flights.addConnection(airport7);

        return flights;
    }
}
