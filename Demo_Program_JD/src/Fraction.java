
public class Fraction {
	// fields
	private int num;
	private int den;
	
	public void setDen(int a){
		if (a != 0){
			den = a;
		}
		else {
			System.out.println("Invalid");
			
		}
	}
	public void setNum(int a) {
		num = a;
		
	}
	
	public int getNum() {
		return num;
		
	}
	public int getDen() {
		return den;
	}
	
} // end class
