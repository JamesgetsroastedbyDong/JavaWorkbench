
public class Tool_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		$JD.println("hello");
		$JD.pause(1000);
		$JD.println("World");
		
		/**
		 * Corrections #1
		 */
		/*
		String result = $JD.delDel("adelbc");
		$JD.print(result);
		result = $JD.delDel("adelHello");
		$JD.print(result);
		result = $JD.delDel("adedbc"); 
		$JD.print(result);
		result = $JD.delDel("del");
		$JD.print(result);
		result = $JD.delDel("a");
		$JD.print(result);
		//*/
		/**
		 * Corrections #2
		 */
		/*
		String result1 = $JD.front3("Java");
		$JD.print(result1);
		result1 = $JD.front3("Chocolate");
		$JD.print(result1);
		result1 = $JD.front3("abc");
		$JD.print(result1);
		result1 = $JD.front3("a");
		$JD.print(result1);
		result1 = $JD.front3("");
		$JD.print(result1);
		//*/
		/**
		 * Corrections #3
		 */
		/*
		String result2 = $JD.biggerTwo(["cat", "fish"], ["a", "be"]);
		$JD.print(result2);
		result2 = $JD.biggerTwo(["super", "sonic"], ["monkey", "bears"]);
		$JD.print(result2);
		result2 = $JD.biggerTwo(["mock", "ing"], ["bird", "ya!"]);
		$JD.print(result2);
		
	}
	//*/
		/**
		 * Corrections #4
		 */
		/*
		String[] result3 = $JD.middleWay([1,2,3], [4,5,6]);
		$JD.print(result3);
		result3 = $JD.middleWay([7,7,7], [3,8,0]);
		$JD.print(result3);
		result3 = $JD.middleWay([5,2,9], [1,4,5]); 
		$JD.print(result3);
//*/
	
		int W = 1;
		int H = 1;
		
		$JD.drawBox(W, H, 'X','*');
	}
}
