/** 
 * Spanish language state of the Music Box
 * @author Kennedy Poag
 */
public class SpanishState extends State {
    private static String TWINKLE_FILE_NAME = "state/songs/twinkle-spanish.txt";
    private static String HAPPY_FILE_NAME = "state/songs/happy-spanish.txt";

    /**
     * Constructor for SpanishState
     * @param box 
     */
    SpanishState (MusicBox box) {
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
        System.out.println("Switching to French");
    }
    /**
     * Switches state box to spanish if spanish button is pressed
     */
    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
        System.out.println("Switched to Spanish");
    }
}
