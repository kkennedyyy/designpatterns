/** 
 * Abstract state for the MusicBox
 * @author Kennedy Poag
 */
import java.util.ArrayList;

public abstract class State {
    protected MusicBox box;
    protected ArrayList<String> starLyrics;
    protected ArrayList<String> happyLyrics;
    /**
     * State constructor
     * 
     * @param box 
     * @param twinkleFileName 
     * @param happyFileName 
     */
    public State (MusicBox box, String twinkleFileName, String happyFileName){
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happyFileName);
    }
    /**
     * Plays "Twinkle Twinkle Little Star" when button is pressed.
     */
    public void pressStarButton() {
        box.playSong("Twinkle Twinkle Little Star ", starLyrics);
    }
    /**
     * Plays "If You're Happy And You Know It" when button is pressed.
     */
    public void pressHappyButton() {
        box.playSong("If You're Happy", happyLyrics);
    }
    /**
     * Switches MusicBox to English language state
     */
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
        System.out.println("Switching to English");
    }
    /**
     * Switches MusicBox to French language state
     */
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
        System.out.println("Switching to French");
    }
    /**
     * Switches MusicBox to Spanish language state
     */
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
        System.out.println("Switching to Spansih");
    }

}
