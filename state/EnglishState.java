/** 
 * English language state of the Music Box
 * @author Kennedy Poag
 */
public class EnglishState extends State {
    
    private static String TWINKLE_FILE_NAME = "state/songs/twinkle-english.txt";
    private static String HAPPY_FILE_NAME = "state/songs/happy-english.txt";

    /**
     * Constructor for EnglishState
     * @param box 
     */
    public EnglishState (MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }
    /**
     * Switches state box to english if english button is pressed
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    /**
    * Switches state box to french if french button is pressed
    */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    /**
    * Switches state box to spanish if spanish button is pressed
    */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }

}
