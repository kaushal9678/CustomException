/**
 * this class throws custom exception of invalid age type if age is less than 18.
 */

/**
 * @author mac
 *
 */
public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
 * 
 * @param message
 *   this is a parametrized constructor which receives paremeter of type String.
 */
public InvalidAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
