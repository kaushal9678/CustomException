/**
 * 
 */

/**
 * @author mac
 *
 */
public class MyException extends Exception {

	private String errorCode="UNKNOWN_EXCEPTION";

	public MyException(String errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}
	 public String getErrorCode(){
	        return this.errorCode;
	    }
}
