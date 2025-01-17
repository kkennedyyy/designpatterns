/** 
 * @author Kennedy Poag
 */
package strategy;

import java.util.ArrayList;

public class BubbleSort implements SortBehavior{
    
    /** 
     * @param appartments
     * @return ArrayList<Appartment>
     */
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        ArrayList<Appartment> sortedList = new ArrayList<>(appartments);
        int length = sortedList.size();

        // embedded for loops to loop through list 
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {

                if (sortedList.get(j).compareTo(sortedList.get(j+1)) > 0 ) {
                    // use a temp var to hold the value so it can be swapped
                    Appartment temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }
        return sortedList;
    }  
}
