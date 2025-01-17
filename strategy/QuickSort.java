/** 
 * @author Kennedy Poag
 */
package strategy;

import java.util.ArrayList;

public class QuickSort implements SortBehavior {
    
    /** 
     * @param appartments
     * @return ArrayList<Appartment>
     */
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        // Make sure list has more than one element
        if (appartments.size() <= 1) {
            return appartments;
        }

        Appartment middle = appartments.get(appartments.size() - 1);

        ArrayList<Appartment> left = new ArrayList<>();
        ArrayList<Appartment> right = new ArrayList<>();
        // Loop through the list and divide based on comparison with middle
        for ( int i = 0; i < appartments.size() - 1; i++) {
            // current element is smaller than middle, add to left
            if (appartments.get(i).compareTo(middle) < 0) {
                left.add(appartments.get(i));
                // else add to right
            } else {
                right.add(appartments.get(i));
            }
        }
        // Sort left and right sublists and merge them
        ArrayList<Appartment> sortedList = new ArrayList<>();
        sortedList.addAll(sort(right));
        sortedList.add(middle);
        sortedList.addAll(sort(left));

        return sortedList;
    }

}
