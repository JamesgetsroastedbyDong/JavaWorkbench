/**
 * Java header. Every class should have this.
 * @author james.duncanson
 *
 */
public class MathExample {
	
	/**
	 * This is the main method. This is where the program
	 * starts running. Every programming language needs a
	 * starting point. Python for example starts at the first
	 * non-indented line of code.
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println("Math Example - Bigins");
		// with java you have to specify variable type;
		int num = 9;
		double numd = 6.7;
		String name = "Paul";
		
		// java supports BEDMAS
		num = 5 + 2 *(1+3);
		
		// % is the mod operator. This checks what the remainder is.
		num = 5%2;
		
		
		num = 10/3;
		
		System.out.println(num);
		
		// Complex Math.
		// If we want to do some complex math we can use th
		// Math class
		
		
		int y = Math.max(78, 23);
		System.out.println(y);
		
		
		
		
		
		
	} //end main
	
	

} // end class
