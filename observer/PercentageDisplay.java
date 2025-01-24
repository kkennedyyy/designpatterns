/** 
 * PercentageDisplay implements Observer interface and observes a subject
 * (poll) and displays the precentage of weighted votes
 * for each candidate
 * @author Kennedy Poag
 */
package observer;

import java.util.ArrayList;

public class PercentageDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

     /** 
     * The constructor registers PercentageDisplay as an observer of the poll.
     * 
     * @param poll 
     */
    public PercentageDisplay(Subject poll){
        this.poll = poll;
        this.candidates = new ArrayList<>();
        poll.registerObserver(this);

    }
    
    /** 
     * Updates the list of candidates and displays the updates
     * percentage of votes for each candidate,
     * @param candidates
     */
    @Override
    public void update(ArrayList<Candidate> candidates){
        this.candidates = candidates;
        display();

    }

     /** 
      * Displays the current percent of total weighted votes for
      * each candidate.
     */
    public void display(){
        System.out.println("\nCurrent Percent of Votes:");
        double totalWeightedVotes = candidates.stream().mapToDouble(Candidate::getWeightedVotes).sum();
        if (totalWeightedVotes > 0){
            for (Candidate candidate : candidates) {
                double percentage = (candidate.getWeightedVotes() / totalWeightedVotes) * 100;
                System.out.println(candidate.getFullName() + " " + String.format("%.2f", percentage) + "%");
            }
        }

    }
    
}
