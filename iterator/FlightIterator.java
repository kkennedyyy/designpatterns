/**
* @author Kennedy Poag
* Iterator over Flight objects that filters and returns the flights
* the match the user's deperature and destination airports. 
*/
import java.util.ArrayList;
import java.util.Iterator;

public class FlightIterator implements Iterator {

    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Constructor for FligthtIterator
     * @param flights
     * @param from   
     * @param to 
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
        this.position = 0;
    }

    /**
     * Checks if there is another flight in the list that matches the departure and destination
     * @return true/false
     */
    @Override
    public boolean hasNext() {
    while (position < flights.size()) {
        Flight currentFlight = flights.get(position);
        if (currentFlight.sameLoc(from, to)) {
            return true;
        }
        position++;
    }
    return false;
    }
    /**
     * Returns next flight in the list if match criteria
     * @return a flight
     */
    @Override
    public Flight next() {
        Flight nextFlight = flights.get(position);
        position++;
        return nextFlight;
    }

}
