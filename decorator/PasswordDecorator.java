/** 
 * @author Kennedy Poag
 * Abstract decorator class to extend password functionality.
 */
package decorator;

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;
    /**
     * Constructor for PasswordDecorator
     * @param passwordBeginning
     */
    public PasswordDecorator (Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;

    }
     /**
     * Retrieves the decorated password string.
     */
    public abstract String getPassword();
    
}
