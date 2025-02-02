/** 
 * @author Kennedy Poag
 * Randomly changes the casing of characters in a password. Each character
 * is converted to uppercase or lowecase with a 50/50 probability. 
 */
package decorator;
import java.util.Random;

public class RandomCasing extends PasswordDecorator {

    /**
     * Constructor for RandomCasing
     * @param passwordBeginning 
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }
    /**
     * Returns the password with random character casing.
     * @return updated password
     */
    @Override
    public String getPassword(){
        Random rand = new Random();
        StringBuilder result = new StringBuilder();
        for ( char c : passwordBeginning.getPassword().toCharArray()) {
                result.append(rand.nextBoolean() ? Character.toUpperCase(c) : Character.toLowerCase(c));
     
            }
        return result.toString();
    }
    
}
