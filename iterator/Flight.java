/**
 * @author Kennedy Poag
 * Flight class represents a flight with a number, deperature and destination airports, 
 * flight times, and number of stops. 
 */
import java.time.LocalTime;

public class Flight {

    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
    * Constructs a flight
    * @param flightNum
    * @param from
    * @param to
    * @param endTime
    * @param numTransfers
    */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime,
    LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

     /**
     * Returns departure airport of flight
     * @return departure Airport
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Returns destination airport of flight
     * @return destination Airport
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Checks if flight's departure and destination matches the airports
     * @param from
     * @param to
     * @return true or false
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    /**
     * Returns string representation of flight details like airport, duration, times,
     * type and number of transfers
     * @return flight information
     */
    public String toString() {
        int startMinutes = startTime.getHour() * 60 + startTime.getMinute();
        int endMinutes = endTime.getHour() * 60 + endTime.getMinute();
        int totalMinutes = endMinutes - startMinutes;
        
        String flightType = "";
        if( numTransfers == 0) {
            flightType = "Direct Flight";
        } else if (numTransfers == 1 ) {
            flightType = numTransfers +" Stopovers";
        } else if (numTransfers >= 2) {
            flightType = numTransfers +" Transfers";
        }

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        return " " + from + " to " + to + " " + 
        startTime + " - " + endTime + " (" + hours + "h "+ minutes + "m) " + flightType;

    }
    
}
