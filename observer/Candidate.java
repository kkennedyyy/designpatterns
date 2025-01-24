
/** 
 * Candidate class that represents a candidate in an election with votes from first, second,
 * and third place. The class adds votes, get votes and weighted votes, and compare candidates.
 * @author Kennedy Poag
 */
package observer;

 public class Candidate {
    private String firstName;
    private String lastName;
    private int totalNumVotes;
    private int numFirstPlaceVotes;
    private int numSecondPlaceVotes;
    private int numThirdPlaceVotes;
/** 
 * Constructs new candidate with first and last name
 * initializes vote counts for firt, second, and third place 
 * and total votes to 0
 * @param firstName
 * @param lastName
 */
    public Candidate(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.numFirstPlaceVotes = 0;
        this.numSecondPlaceVotes = 0;
        this.numThirdPlaceVotes = 0;
        this.totalNumVotes = 0;

    }
    
    /** Compares two candidates first and last name to see if 
     * they're equal. Returns true if match found
     * @param firstName
     * @param lastName
     * @return boolean
     */
    public boolean equals(String firstName, String lastName){
        return this.firstName.equals(firstName) && this.lastName.equals(lastName);

    }

     /**
     * Increments the number of votes for the candidate in the first place category.
     */
    public void addFirstPlaceVote(){
        numFirstPlaceVotes++;
        addVote();
    }

     /**
     * Increments the number of votes for the candidate in the second place category.
     */
    public void addSecondPlaceVote(){
        numSecondPlaceVotes++;
        addVote();
    }

     /**
     * Increments the number of votes for the candidate in the third place category.
     */
    public void addThirdPlaceVote(){
        numThirdPlaceVotes++;
        addVote();
    }
    
    /** 
     * Calculates and returns thr weighted votes for a candidate
     * @return weighted votes as a double
     */
    public double getWeightedVotes(){
        return numFirstPlaceVotes * 3 + numSecondPlaceVotes * 2 + numThirdPlaceVotes;
    }
    
    /** 
     * Returns the full name of candidate
     * @return String
     */
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
     /**
     * Increments the total number of votes
     */
    public void addVote() {
        totalNumVotes++;
    }
    
    /** 
     * Returns the total number of first place votes for a candidate
     * @return int
     */
    public int getNumFirstPlaceVotes(){
        return numFirstPlaceVotes;
    }
    
    /** 
     * Returns the total number of second place votes for a candidate
     * @return int
     */
    public int getNumSecondPlaceVotes(){
        return numSecondPlaceVotes;
    }
    
    /** 
     * Returns the total number of third place votes for a candidate
     * @return int
     */
    public int getNumThirdPlaceVotes(){
        return numThirdPlaceVotes;
    }
}

