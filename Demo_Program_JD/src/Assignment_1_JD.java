import java.util.Scanner;

public class Assignment_1_JD {
	
	public static void game() {
		
		// Variables - game method - they only exist in the game method
		Scanner wordsIn = new Scanner(System.in);
		Scanner numsIn = new Scanner(System.in);
			
		int P = 0;
		String input = "";
			
		$JD.println("Febuary 1984... ");
		$JD.pause(P);
		$JD.println("You were working... ");
		$JD.pause(P);
		$JD.println("but something strange occured...");
		$JD.pause(P);
		$JD.println("-----------------------");
		
		
		$JD.println("You: ENGINE 1 DOWN! ENGINE 1 DOWN!");
		$JD.pause(P);
		$JD.println("");
		$JD.println("BEEP BEEP");
		$JD.pause(P);
		$JD.println("");
		$JD.println("Co-Captain: *krr* MAYDAY MAYDAY! WE ARE GOING DOWN! I REPEAT WE ARE GOING DOWN!");
		$JD.pause(P);
		$JD.println("");
		$JD.println("BEEP BEEP");
		$JD.pause(P);
		$JD.println("");
		$JD.println("You: WE NEED TO JUMP! WHERE ARE THE SHOOTS!... CAPTAIN! THE SHOOTS!");
		$JD.pause(P);
		$JD.println("");
		$JD.println("BEEP BEEP!");
		$JD.println("BEEP BEEP!");
		$JD.println("BEEP BEEP!");
		$JD.pause(P);
		$JD.println("");
		$JD.println("Computer: BEEP BEEP");
		$JD.pause(P);
		$JD.println("");
		$JD.println("You: *startled* Huh? Whats this?");
		$JD.pause(P);
		$JD.println("In front of you was your computer with a singular application 'CODE'");
		
		
		
			
		$JD.println("Do you chose to work or fall back asleep. Work or Sleep?: ");
		input = wordsIn.nextLine();
			
		input = input.toUpperCase();
		
		if (input.equals("WORK")){
		
			$JD.println("You realised it was a dream, pouted, and contiued to work");
		}
		else if (input.equals("SLEEP")) {
			
			
			$JD.println("You chose to sleep... 5 minutes later, your boss walks in on your snoozing ");
			$JD.println("and immediately fires your ass");
			$JD.println("~~~~~~~~~~~GAME OVER~~~~~~~~~~~~");
			System.exit(0);
		}
		else{
			
			$JD.println("Your trying to break the game eh? Well...");
			$JD.println("~~~~~~~~~~~GAME OVER~~~~~~~~~~~~");
			System.exit(0);
		}
		
		$JD.println("");
		$JD.println("-----------------------");
		$JD.println("You read on your computer 'Google' and sigh at what you think is a lost cause");
		$JD.pause(P);
		$JD.println("");
		$JD.println("You (under your breath): you messed up Chris... Google is soon to fail");
		$JD.pause(P);
		$JD.println("");
		$JD.println("You click on 'CODE' at the bottom of your desktop and begin to work");
		$JD.pause(P);
		$JD.println("");
		$JD.println("Today is a different day at work.. you feel more creative and deside to create");
		$JD.println("something groundbreaking. Do you create a portal, time machine, or 'ROBLIX': ");
		input = wordsIn.nextLine();
		
		input = input.toUpperCase();
		
		if (input.equals("PORTAL")){
		
			$JD.println("You type the simple words: 'CREATE PORTAL' and a bright purple light emerges from ");
			$JD.println("the computer screen and violently sucks you into the screen. ");
			$JD.println("You reappear as a small square-head man and wonder where you are.");
			$JD.println("");
		}
		else if (input.equals("TIME MACHINE")) {
			
			
			$JD.println("You create a time machine which sends you back to 1 B.C... you find that there ");
			$JD.println("is no way back to present day because it was a one-way trip and the technology ");
			$JD.println("here doesn't allow you to create a new machine... Your only way back is to be ");
			$JD.println("supa tight with JESUS and maybe he can tell his big boy father to send you back. ");
			$JD.println("Unfortunately for you though... jesus hasn't been born yet and you'd have to ");
			$JD.println("wait many years until he can understand you, so sit down.. relax... ");
			$JD.println("and suddenly get attacked by romans. ");
			$JD.println("~~~~~~~~~~~GAME OVER~~~~~~~~~~~~");
			$JD.println("");
			System.exit(0);
		}
		else if (input.equals("ROBLIX")){
			
			$JD.println("");
			$JD.println("You begin creating the great idea of 'ROBLIX'... turns out to be a disappointment ");
			$JD.println("and get fired... Many years later you moved on and became the greatest garbage ");
			$JD.println("picker-upper and got a call that you've become the largest internet meme. You ");
			$JD.println("finally was happy for once in many years.. You quit your job and continue to ");
			$JD.println("develop 'ROBLIX' and create your own genius sound effect 'OOF'... this success ");
			$JD.println("lasts for a week and again fails, you spend the rest of your telling young ");
			$JD.println("wipper-snappers to get off your lawn.");
			$JD.println("");
			System.exit(0);
		}
		else{
			
			$JD.println("Your trying to break the game eh? Well...");
			$JD.println("~~~~~~~~~~~GAME OVER~~~~~~~~~~~~");
			System.exit(0);
		}
		
		$JD.println("");
		$JD.println("----------------------");
		$JD.println("");
		$JD.println("U wanna play melee robbie?");
		
	
	}
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
			
			System.out.println("Have Fun? ;)");
			System.out.println("Play again? (YES/NO)");
			System.out.println("Input: ");
			input = wordsIn.nextLine();
			
			
		} while (input.equals("YES"));
		
		
		System.out.println("Buh-Bye");
	
	}

	}

