/** 
 * @author Kennedy Poag
 * Airline class that holds a collection of flightd
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Airline {

    private String title;
    private ArrayList<Flight> flights;

    /**
     * Airline constructor: loads the flights 
     * @param title 
     */
    public Airline (String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();        
    }
    
     /**
     * Returns title of the airline
     * @return title 
     */
    public String getTitle() {
        return this.title;
    }

     /**
     * Checks the input codes to make sure they're valid and interates
     * over the list to get the correct flights
     * @param fromCode
     * @param toCode 
     * @return list of flights
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        String fromFormat = fromCode.trim().toUpperCase();
        String toFormat = toCode.trim().toUpperCase();
       
        boolean validFrom = false;
        boolean validTo = false;

        for (Airport place : Airport.values()) {
            if (place.name().equals(fromFormat)) {
                validFrom = true;
            }
            if (place.name().equals(toFormat)) {
                validTo = true;
            }
        }
        if (!validFrom || ! validTo) {
           System.out.println("Must enter valid airport codes");
           return null;
        }


        Airport from = Airport.valueOf(fromFormat);
        Airport to = Airport.valueOf(toFormat);

        return new FlightIterator(flights, from, to);

    }
}
