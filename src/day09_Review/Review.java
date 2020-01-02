package day09_Review;

public class Review {
	
	/*
	    relational :
	       >  :  greater, X= 10 Y= 9,   returns true only when x > y
	       >= : greater than or equal, returns true when either greater or equal
	       <  : less than
	       <= : less than or equal
	       == : equal
	       != : equal to logical opposite,  not equal
	       
	      logical operators : 
	          && : true if both conditions are true
	          || : true as long as one condition is true
	       
	 */
	
	public static void main(String[] args) {
		
		System.out.println('Z' > 'A');  // true
		
		System.out.println('Z' >= 'A');  // true
		System.out.println('a' > 'A');  // true
		
		System.out.println('a'< 'A'); // false
		
		System.out.println('A' <= 'A');  //  !false = true
		System.out.println('A' <= 'a');  // true
		//                  65 <=  97    true
		
		System.out.println(false == false);  // true
		System.out.println(false != true);  // true
		
		byte X = 10;  int Y = 10;
		System.out.println(X == Y);  // for primitives it is TRUE
		
		System.out.println(true != true|| false == true); // false
		
		System.out.println("Monday" == "Funday" || true == !false);
		
		
		
		
		
		
		  
		
		
	}

}
