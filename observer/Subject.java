/** 
 * Subject interface allows objects that maintain a list of observers and notify
 * them of changes. Classes acting as a subject must implement this to allow
 * observers to register, remove, and be notified when subject's state changes. 
 * @author Kennedy Poag
 */
package observer;


public interface Subject {

     /** 
     * Registers an observer to recieve updates from the subject
     * @param observer 
     */
     void registerObserver(Observer observer);

      /** 
     * Removes an observer from list of observers
     * @param observer 
     */
     void removeObserver(Observer observer);
     
      /** 
     * Notifies all registered observers when the subject's state changes
     */
     void notifyObservers();
}
