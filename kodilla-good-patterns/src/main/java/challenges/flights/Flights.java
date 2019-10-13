package challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class Flights {
    private Set<Airport> connections = new HashSet<Airport>();

    public void addConnection(Airport airport){
        connections.add(airport);
    }

    public Set<Airport> getConnections() {
        return connections;
    }
}
