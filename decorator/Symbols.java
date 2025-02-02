/** 
 * @author Kennedy Poag
 * Replaces certain letters in the password with a symbol
 */
package decorator;

public class Symbols extends PasswordDecorator {
     /**
     * Constructor for Symbols
     * 
     * @param passwordBeginning 
     */
    public Symbols (Password passwordBeginning){
        super(passwordBeginning);
    }
    /**
     * Returns the password with specific letter/symbol subtitutes.
     * @return updated password 
     */

    public String getPassword() {
        return passwordBeginning.getPassword()
        .replace('a', '@')
        .replace('b', '8')
        .replace('e', '3')
        .replace('g', '9')
        .replace('i', '!')
        .replace('o', '0')
        .replace('s', '$')
        .replace('t', '7');

    }


    
}
