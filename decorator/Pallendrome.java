/** 
 * @author Kennedy Poag
 * Pallendrome class is decorator for Password class that creates a palindrome
 * by adding the reverse of the original password to itself.
 */
package decorator;

public class Pallendrome extends PasswordDecorator {

     /** 
     * Constructor for Pallendrome. 
     * @param passwordBeginning  
     */
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }
    
    
    /** 
     * Returns pallendrome of the password by adding the original
     * and reverse to eachother
     * @return updated password
     */
    public String getPassword(){
        String original = passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
}
