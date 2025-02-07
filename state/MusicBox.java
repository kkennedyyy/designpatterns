/** 
 * MusicBox that switches between French, Spanish, English
 * languages and the songs
 * @author Kennedy Poag
 */
import java.util.ArrayList;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructor for MusicBox and initializes language states
     * Sets default to Englidh
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = new EnglishState(this);
    }

    /**
     * Plays "Twinkle Twinkle Little Star" 
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Plays "If You're Happy and You Know It" 
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

     /**
     * Switches the MusicBox to English state.
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

     /**
     * Switches the MusicBox to French state.
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

     /**
     * Switches the MusicBox to Spanish state.
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Sets current state of MusicBox.
     * @param state 
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * getter for englishState
     * @return english state of MusicBox
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * getter for frenchState
     * @return french state of MusicBox
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * getter for spanishState
     * @return spanish state of MusicBox
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays song by printing lyrics to terminal
     * @param songName 
     * @param lyrics 
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Playing: " + songName);
        for (String line : lyrics) {
            System.out.println(line);
        }
    }

    
}
