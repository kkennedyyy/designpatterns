/** 
 * @author Kennedy Poag
 */
package strategy;

import java.util.ArrayList;

public interface SortBehavior {
    // sorts the list of apartments
    ArrayList<Appartment> sort(ArrayList<Appartment> appartments);
}
