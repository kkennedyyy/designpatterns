/** 
 * TallyDisplay implements Observer interface.
 * Displays the current number of votes for each candidate and updates
 * when the poll data changes. 
 * @author Kennedy Poag
 */
package observer;

import java.util.ArrayList;

public class TallyDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;
    
     /**
     * Constructor for TallyDisplay and registers it with the Subject poll.
     * @param poll 
     */
    public TallyDisplay(Subject poll){
        this.poll = poll;
        this.candidates = new ArrayList<>();
        poll.registerObserver(this);
    }
    
    /** 
     * Updates the list of candidates and displays the current vote.
     * @param candidates
     */
    @Override
    public void update(ArrayList<Candidate> candidates){
        this.candidates = candidates;
        display();

    }

    /** 
     * Displays the current tallies for each candidate
     */
    public void display(){
        System.out.println("\nCurrent Tallies: ");
        for (Candidate candidate : candidates) {
                    System.out.println(candidate.getFullName() + ": " +
                    "First(" + candidate.getNumFirstPlaceVotes() + "), " +
                    "Second(" + candidate.getNumSecondPlaceVotes() + "), " +
                    "Third(" + candidate.getNumThirdPlaceVotes() + ")");
                }
        }
}
