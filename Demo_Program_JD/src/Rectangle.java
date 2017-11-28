/**
 * making a rectangle show up on the screen
 * September 29th, 2017
 * @author james.duncanson
 *
 */
public class Rectangle { // start main
	
	
	// fields
	private int x; // Position of Rectangle
	private int y;
	private double l; // length of rectangle
	private double w; // width of rectangle
	
	
	//~~~~~~~~~~GET SET METHODS~~~~~~~~~~~
	public void setX(int xpos) {
		x = xpos;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int ypos) {
		y = ypos;
	}
	
	public int getY() {
		return y;
		
	}
	public double getArea() {
		return l*w;
	}
} // end main
