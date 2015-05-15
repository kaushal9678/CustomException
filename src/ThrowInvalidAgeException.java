import java.io.DataInputStream;
import java.io.IOException;

/**
 * 
 */

/**
 * @author mac
 *
 */
public class ThrowInvalidAgeException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter ager greater than 18");
		DataInputStream dis=new DataInputStream(System.in);
		try {
			int age=Integer.parseInt(dis.readLine());
			ageException(age);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Please enter numeric value ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 
	 * @param age
	 * @throws InvalidAgeException
	 * 
	 *             this method check if age is less than or equal to 18 then
	 *             throw InvaidAgeException else show a message of "Welcome"
	 * 
	 */
	public static void ageException(int age) throws InvalidAgeException {

		if (age < 18) {
			throw new InvalidAgeException("not valid age");
		} else {
			System.out.println("Welcome to custom exception Handling");
		}
	}

}
