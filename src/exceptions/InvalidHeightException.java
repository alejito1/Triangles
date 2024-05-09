/**
 * 
 */
package exceptions;

/**
 * The class InvalidHeightException is a subclass of exception. It can be used when a height of a shape is equals or
 * lower to 0 
 */
public class InvalidHeightException extends Exception {
	/**
	 * create an instance of InvalidHeightException
	 * @param message
	 */
	public InvalidHeightException (String message) {
		super(message);
	}

}
