/**  
 * Represents math question with two random numbers and an oepration.
 * Question is either addition, subtraction, or multiplication
 * @author Kennedy Poag
 */
package singleton;

import java.util.Random;

public class Question {

    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";

    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * Constructs a new question with two random numbers (between 1-100)
     * Also chooses a random operand.
     */
    public Question() {
        Random rand = new Random();
        Operand[] operands = Operand.values();

        num1 = rand.nextInt(100) + 1;
        num2 = rand.nextInt(100) + 1;
        operand = operands[rand.nextInt(operands.length)];

        if (operand == Operand.PLUS) {
            answer = num1 + num2;
        } else if (operand == Operand.MINUS) {
            answer = num1 - num2;
        } else {
            answer = num1 * num2;
        } 
    }
    
    /** 
     * Returns the question in string format
     * @return String
     */
    public String getQuestion() {
        return num1 + " " + operand.label + " " +  num2 + " = ";
    }

    /** 
     * Sets user's answer
     * @param answer
     */
    public void setUserAnswer(int answer) {
        this.userAnswer = answer;
    }
 
    /** 
     * Checks if the userAnswer is right
     * @return boolean
     */
    public boolean isCorrect() {
        return userAnswer == answer;
    }

    /** 
     * Returns a string and changes the color based on if 
     * the answer is correct or incorrect.
     * @return String
     */
    public String toString() {
        if (isCorrect()) {
           return  ANSI_GREEN + num1 + " " + operand.label + " " + num2 + " = " + answer + ANSI_BLACK; 
        } else {
            return ANSI_RED +   num1 + " " + operand.label + " " + num2 + " = " + answer + " You answered " + userAnswer + ANSI_BLACK;
        }
    }
}
