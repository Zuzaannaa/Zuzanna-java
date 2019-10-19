package challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class Flights {
    private Set<Flight> connections = new HashSet<Flight>();

    public void addConnection(Flight flight){
        connections.add(flight);
    }

    public Set<Flight> getConnections() {
        return connections;
    }
}
