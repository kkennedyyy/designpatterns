/** 
 * @author Kennedy Poag
 * Abstract class representing a password
 * Base class for password implementations
 */
package decorator;

 public abstract class Password {
     /** 
     * password value is stored
     */
    protected String password;

     /** 
     * gets stored password in subclasses once implemented
     */
    public abstract  String getPassword();
    
}
