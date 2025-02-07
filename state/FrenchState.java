/** 
 * French language state of the Music Box
 * @author Kennedy Poag
 */
public class FrenchState extends State{
    private static String TWINKLE_FILE_NAME = "state/songs/twinkle-french.txt";
    private static String HAPPY_FILE_NAME = "state/songs/happy-french.txt";

    /**
     * Constructor for FrenchState
     * @param box 
     */
    FrenchState (MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }
    /**
     * Switches state box to english if english button is pressed
     */
    @Override
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
        System.out.println("Switching to English");
    }
    /**
     * Switches state box to french if french button is pressed
     */
    @Override
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
        System.out.println("Switched to French");
    }
    /**
     * Switches state box to spanish if spanish button is pressed
     */
    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
        System.out.println("Switching to Spanish");
    }

    
}
