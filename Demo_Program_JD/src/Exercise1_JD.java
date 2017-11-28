import java.util.Scanner;

public class Exercise1_JD {

	public static void main(String[] args) {
		
		// Variable declaration section
		//All variables are declares at the tap of the program
		
		Scanner s = new Scanner(System.in);
		
		double area = 0;
		double r = 99;
		
		double vol = 0;
		double radiusCyl = 0;
		double heightCyl = 0;
		
		double atri = 0;
		double btri = 0;
		double hytri = 0;
	
		
		// Calculation 1
		
		
		System.out.println("Calculation 1: Area of a Circle");
		
		System.out.print("Input radius of circle: "); // Step 1: Prompt for input
		r = s.nextDouble(); // Step 2: Take input
		
		System.out.println(""); // Extra enter
		
		// By changing 22 to 22.0 the program assumes 22.0 is a double and does normal division
		area = (Math.PI)*r*r;
		
		
		System.out.println("A Circle with radius "+r+"cm, has an area of "+area+ "cm2");
		
		// Calculation 2:
		
		
		// Start of Calculation 2
		System.out.println("Calculation 2: Volume of Cylinder");
		
		System.out.print("Input radius of Cylinder: ");
		radiusCyl = s.nextDouble(); // Take input of radius for Cylinder
		
		System.out.print("Input height of Cylinder: ");
		heightCyl = s.nextDouble(); // Take input of height for Cylinder
		
		vol = (Math.PI)*(radiusCyl*radiusCyl)*heightCyl;
		
		
		System.out.println("The volume of your cylinder with a radius of "+radiusCyl+"cm, and a height of "+heightCyl+"cm, has a volume of "+vol+"cm2");
		// Step 4: Output
		
		// Calculation 3
		System.out.println("Calculation 3: Hypontenuse of a Right Triangle"); // Step 1: Prompt for input
		
		System.out.print("Input side of 'a' of the triangle: ");
		atri = s.nextDouble();
		System.out.print("Input side 'b' of the triangle: ");
		btri = s.nextDouble(); // Step 2: Inputs
		
		hytri = Math.sqrt(atri*atri+btri*btri); // Step 3: Process
		
		System.out.println("A Trangle with one side "+atri+" and the other side "+btri+"has a hypotenuse: "+hytri+"");
		
		
		
	}

}
