/** 
 * @author Kennedy Poag
 * Randomly inserts speciall characters into a password. Special characters
 * are added with 30% probability after each char.
 */
package decorator;
import java.util.Random;

public class SpecialChars extends PasswordDecorator {
    /**
     * Constructor for SpecialChars
     * @param passwordBeginning 
     */
    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
    }
    /**
     * Returns the password after randomly inserting special characters.
     * Special characters are chosen from the set and inserted with a 30$ probability. 
     * @return updated password 
     */
    public String getPassword(){
        char[] SPECIALCHAR = {'*', '!', '%', '+','.','{', '}'};
        Random rand = new Random();
        StringBuilder result = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            result.append(c);
            if (rand.nextInt(100) < 30) {
                result.append(SPECIALCHAR[rand.nextInt(SPECIALCHAR.length)]);
            }
        }
        return result.toString();

    }
    
}
