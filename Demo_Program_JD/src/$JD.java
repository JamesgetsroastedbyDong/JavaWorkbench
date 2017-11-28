/**
 * This is my tools class where I will put test corrections and 
 * various skills I learn throughout the year
 * @author james.duncanson
 *
 */
public class $JD {
	
	/**
	 * This method prints the past string to this console
	 * 
	 * @param s
	 */
	public static void print(String s) {
		System.out.print(s);

		
	} // end print
	
	/**
	 * 
	 * @param s
	 */
	public static void println(String s){
		System.out.println(s);
	}
	
	/**
	 * This method pauses the code for a set amount of time
	 * 
	 * @param delay
	 */
	public static void pause(int delay) {
		
		try {
			Thread.sleep(delay);
			
		}
		catch(Exception e) {
			
			
		}
	} //end pause

	public static void drawBox(int w, int h, char in, char out){
		
		for(int j = 0; j < h; j = j + 1){
			
		
			for(int i = 0; i < w; i = i +1){
				$JD.println("*****");
				$JD.println("*XXX*");
				$JD.println("*XXX*");
				$JD.println("*XXX*");
				$JD.println("*****");
				
			}
			$JD.println("");
		}
	}
} // end class
