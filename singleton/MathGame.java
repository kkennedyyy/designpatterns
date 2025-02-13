/** 
 * Represents math game that generates random math problems
 * @author Kennedy Poag
 */
package singleton;

import java.util.ArrayList;
import java.util.Iterator;

public class MathGame {
    public static int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;

    /**
    * Intializes list of questions using a for loop
    * Makes sure only one instance of MathGame is created.
    */
    private MathGame(){
        questions = new ArrayList<>();
        for (int i=0; i< NUM_QUESTIONS; i++) {
            questions.add(new Question());
        }
    }

    /** 
     * Returns singleton instance of MathGame
     * Creates a new one if one doesn't exist.
     * @return 
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
            return mathGame;
    }

   /** 
    * Returns iterator over list of questions
    * @return
    */
   public Iterator<Question> getIterator() {
        return questions.iterator();
    }
}
