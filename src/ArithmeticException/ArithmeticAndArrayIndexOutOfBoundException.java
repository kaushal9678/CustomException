/**
 * this class handles arithmetic and arrayindexout of bound exceptions
 */
package ArithmeticException;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author mac
 *
 */
public class ArithmeticAndArrayIndexOutOfBoundException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println("==========This Program shows arithmetic Exception============");
		System.out.println("Please enter dividend");
		DataInputStream dis = new DataInputStream(System.in);
		try {
			int dividend = Integer.parseInt(dis.readLine());
			System.out.println("Please enter divisior");
			int divisior = Integer.parseInt(dis.readLine());
			arithmeticExceptionHandle(dividend, divisior);

			System.out.println("Please enter array Size");
			int[] array;
			int size;
			size = Integer.parseInt(dis.readLine());
			array = new int[size];
			System.out.println("Please enter array values");
			for (int i = 0; i < size; i++) {
				int num = Integer.parseInt(dis.readLine());
				array[i] = num;
			}

			System.out
					.println("Please enter index to print value for that element");
			int index = Integer.parseInt(dis.readLine());
			// System.out.println("Element at provided index="+""
			// +array[index]);
			arrayIndexOutOfBoundExceptionHandle(array, index);

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * handle arithmetic exception when dividend is divided by divisior 0 then
	 * throws Arithmetic Exception
	 */

	public static void arithmeticExceptionHandle(int dividend, int divisior) {

		try {
			int quotient = dividend / divisior;
			System.out.println("your quotient is: " + quotient);
		} catch (ArithmeticException exception) {
			System.out.println("Arithmetic Exception cause is "
					+ exception.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * handle ArrayIndex OutOf Bound exception when array index is out of it's bound then
	 * throws ArrayIndexOutOfBound Exception
	 */
	public static void arrayIndexOutOfBoundExceptionHandle(int[] array,
			int index) {

		try {
			System.out.println("you are accessing index " + "" + index);
			System.out.println("you are accessing index value " + " " + index
					+ "" + array[index]);
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("ArrayIndexOutOfBound Exception cause is "
					+ exception.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
