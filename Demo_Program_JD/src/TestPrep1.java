import java.util.Scanner;

/**
 * 
 * @author james.duncanson
 *
 */
public class TestPrep1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//Declares and initializes integer n to 0
		/*
		 * It is always best to declare an initialize your variables 
		 * at the top of a method.
		 * What is the difference between and integer and a double?
		 * 
		 * A: 	An integer stores only integers like 2 or 3 or 1 000 000
		 * 		but it can't store 2.3 or 3.4
		 * 
		 * 
		 */
		int n = 0; 
		$JD.print("Please input how many values in array: ");
				
		n = s.nextInt();
		
		double[] arr = new double[n]; // create my array of length n
		
		
		// What structure would I use to take an input for every element of the array
		// A: Counted loop, which is a for loop
		
		
		for (int i = 0; i < arr.length; i = i + 1){
	
			
			/*
			 * A do while is called a conditional loop. I turns as long as a condition is true.
			 * It will ALWAYS RUN ONCE
			 */
			
			do{
				
				$JD.print("Input real number: ");
				arr[i] = s.nextDouble();
				
				if (arr[i] < 0 || arr[i] > 100) {
					$JD.println("ERROR - BAD VALUE");
				}
				
				
			} while (arr[i] < 0 || arr[1] > 100);
			
			
		}
		
		
		$JD.println("END PROGRAM");

	} //end main

} //end class
