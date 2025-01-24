/** 
 * Observer interface allows specific classes to recieve updates from the Subject (poll)
 * Observers are notified when the Subject (poll) changes.
 * @author Kennedy Poag
 */
package observer;

import java.util.ArrayList;

public interface Observer {

    /** 
     * Updates the observer with the most recent list 
     * of candidates from the Subject.
     * @param candidates 
     */
    public void update(ArrayList<Candidate> candidates);
}
