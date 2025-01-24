/** 
 * StudentGovPoll class represents a polling system for student gov. elections.
 * Maintains a list of candidates and observers and notifies when the poll updates
 * Class implements Subject interface
 * @author Kennedy Poag
 */
package observer;

import java.util.ArrayList;

public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    /**
     * Constructor for StudentGovPoll 
     * Intializes a new list of candidates and observers
     * @param school 
     */
    public StudentGovPoll(String school) {
        this.school = school;
        this.candidates = new ArrayList<>();
        this.observers = new ArrayList<>();
    }
    
    /** 
     * Registers an observer to be notified when the poll is changed
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }
    
    /** 
     * Removes an observer so it's no longer notified of updates
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
    /**
     * Notifies all registered observers about  poll updates
     * of candidates and their vote tallies.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }
    
    /** 
     * Adds a new candidates first and last name to the poll
     * @param firstName
     * @param lastName
     */
    public void addCandidate(String firstName, String lastName){
        candidates.add(new Candidate(firstName, lastName));
    }
    
    /** 
     * Records the votes for candidates based on their position.
     * Observers are notified after updating votes
     * @param firstPlace
     * @param secondPlace
     * @param thirdPlace
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace){
        candidates.get(firstPlace - 1).addFirstPlaceVote();
        candidates.get(secondPlace - 1).addSecondPlaceVote();
        candidates.get(thirdPlace - 1).addThirdPlaceVote();
        notifyObservers();   
    }
    
    /** 
     * Returns the name of the school
     * @return String
     */
    public String getSchool() {
        return school;
    } 

}
