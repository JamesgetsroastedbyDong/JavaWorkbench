import java.util.Scanner;

public class Assignment_1_JD_DEMO {
	
/**
 * James Duncanson
 * Assignment 1
 * 
 * October 16, 2017
 */

	
	public static void game() {
		
		// Variables - game method - they only exist in the game method
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
		
		String input = "";
		
		System.out.println("Suddenly you hear a large explosion and then everything goes black");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("You wake up and the bridge is in chaos");
		
		System.out.println("You roll over and see a large flashing button. Do you press it?(YES/NO)");
		
		/*
		 * Problem: If the user types in anything other than yes, the program
		 * 
		 * 
		 * There are two types on conditional loops:
		 * 1. While loop: This is an if statement but we switch the words if with while. IT MIGHT SKIP
		 * 2. do while loop: Like a while loop but it always runs once.
		 */
		do {
			System.out.print("Do you press it? ");
			input = wordsIn.nextLine();
 
		
		//We want to analyse what the user inputs
		//Trick: With strings you can check more combination if you convert the string to upper or lower case
			input = input.toUpperCase();
		} while (input.equals("YES") == false && input.equals("NO") == false);	
		
		if (input.equals("YES")){
			
			
			do {
				System.out.println("Are you sure? ");
				input = wordsIn.nextLine();
	 
			
			//We want to analyse what the user inputs
			//Trick: With strings you can check more combination if you convert the string to upper or lower case
				input = input.toUpperCase();
			} while (input.equals("YES") == false && input.equals("NO") == false);
			
		}
		
		if (input.equals("YES")){
			System.out.println("*DEAD*");
			
			//IF YOU DIE YOU WANT TO GO TO THE EXIT METHOD
			return; // stops the method
		} // end if statement

		System.out.println("You remember it was the self-destruct button and leave it be");
		
		} // end game
	
	public static void main(String[] args) {
		
		// Variables - game method - they only exist in the game method
		// Every method that takes inputs needs to have scanner objects
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
				
		String input = "";
		
		System.out.println("Start Main");
		
		//LOOP GAME:
		// To loop the game we will use a conditional loop called a do while loop
		// do while loops are perfect for situations where we must run the loop
		// one.
		
		do{
			
			game();
			
			System.out.println("Play again? (YES/NO)");
			System.out.println("Input: ");
			input = wordsIn.nextLine();
			
			
		} while (input.equals("NO"));
		
		
		System.out.println("End Main");
		

	} // end main

} // end class
