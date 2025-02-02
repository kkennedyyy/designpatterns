/** 
 * @author Kennedy Poag
 * EasyPassword class extends Password class and generates a simple password.
 * The password is made by replacing spaces with hyphens and
 * placing a random integer between 0 and 99 at the end of the password. 
 */
package decorator;
import java.util.Random;

public class EasyPassword extends Password {
     /** 
     * Constructor for EasyPassword. Modifies given phrase and replaces
     * spaces with hyphens and adds a random number to the end.
     * @param phrase
     */
    public EasyPassword(String phrase){
        password = phrase.replace(" ", "-") + new Random().nextInt(100);

    }
    
    /** 
     * Returns generated password
     * @return updated password
     */
    public String getPassword() {
        return password;
    }
    
}
