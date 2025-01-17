package strategy;
import java.util.ArrayList;
/** 
 * @author Kennedy Poag
 */
public class AppartmentList {
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    /** Constructor for AppaertmentList */
    public AppartmentList() {
        this.appartments = new ArrayList<>();
        this.sortBehavior = new BubbleSort();
    }
    
    /** 
     * @param address
     * @param numBedrooms
     * @param numBathrooms
     * @param price
     */
    /** Add an appartment to the list*/ 
    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        Appartment appartment = new Appartment(address, numBedrooms, numBathrooms, price);
        appartments.add(appartment);
    }
    
    /** 
     * @param sortBehavior
     */
     /** Setter to set which sort behavior */ 
    public void setSortBehavior(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }
    
    /** 
     * @return ArrayList<Appartment>
     */
    /** Getter to get sorted list */
    public ArrayList<Appartment> getSortedList() {
        return sortBehavior.sort(new ArrayList<>(appartments));

    }
    
    /** 
     * @return ArrayList<Appartment>
     */
    /** Getter to get unsorted list */
    public ArrayList<Appartment> getUnSortedList(){
        return new ArrayList<>(appartments);
    }
}
