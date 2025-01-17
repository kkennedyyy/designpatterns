package strategy;
import java.util.ArrayList;
/** 
 * @author Kennedy Poag
 */
public interface SortBehavior {
    /**  sorts the list of apartments */
    ArrayList<Appartment> sort(ArrayList<Appartment> appartments);
}
