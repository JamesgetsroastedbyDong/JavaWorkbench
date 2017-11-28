
public class LoopDemo {

	public static void main(String[] args) {
		
		/*
		 * What is a loop structure:
		 * 
		 * A loop structure is a structure that repeats a section of code. All programming languages have them in some form
		 * 
		 * There are two classifications of loops I should know:
		 * 
		 * COUNTED LOOP: ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * 
		 * 		A counted loop is typically used when you know in advance how many times the loop should run.
		 * 		example: for loop 
		 * 				 for (<count>; <check>; <change>){
		 * 					//LOOP CODE
		 * 
		 * 
		 * 	1. Declare and initialize
		 * 		i = 0
		 * 	2. Check count i < 5 --> 0 < 5 True
		 * 
		 * 	3. If true we enter the loop, other wise we skip
		 * 
		 * 	4. (true) Run loop code
		 * 
		 * 	5. At bottom of loop apply change and check again
		 */
		
		for (int i = 0; i < 5; i = i + 1) {
			
			//LOOP BLOCK
			System.out.println(i);
			
		}
		
		// Conditional loop that will print out 50 to -50
		for (int i = 50; i >= -50; i = i - 1) {
			
			System.out.println(i);
		}
	}

}
