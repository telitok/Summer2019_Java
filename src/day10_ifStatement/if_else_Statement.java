package day10_ifStatement;

public class if_else_Statement {

	/*
	 if & else statement:
	 
	    if ( condition ) { 
	          // A      if block gets executed if the condition is true
	    }
	     else {
	          // B      else block gets executed if the condition is false
	    }
	    
	    if condition is true -> A
	    if condition is false -> B
	 */
	
	public static void main(String[] args) {
		
		if (9>8) {
			System.out.println("9 is greater than 8");
		}
		if (9<8) {
			System.out.println("9 is less tahn 8");
		}
		if (9==8) {
			System.out.println("9 is equal to 8");
		}
		if (9>=8) {
			System.out.println("9 is greater than or equal to 8");
		}
		else {
			System.out.println("9 is less than 8");
		}
	// if 9 is not greater or equal to 8, then 9 must be less than 8
		
		if (false == !false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		  Task 01:
		    if score is < 60 ==> failed
		    if score is >= 60 but score < 90 ==> pass
		    if score is >= 90 ==> passed with distinction
		 */
		
		int score = 99;
		if (score >= 60) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	
	/* 
	 Task 02:
	 1. triangle: has three angles,
	              and sum of three angles MUST be equal to 180
	      1. declare three variables angle1, angle2, angle3
	      2. write a program to check if the triangle is valid or not
	 */
		
		int angle1 = 20, angle2 = 50, angle3 = 75;
		
		boolean valid = (angle1+angle2+angle3) == 180;
				
	    if (valid) {
	    	System.out.println("it's valid triangle");
	    }
	    else {
	    	System.out.println("invalid triangle, do some math");
	    }
	    
	  
	    
	 /*
	  Multi-branch if statement: we use them when there are more than two possibilities.
	  
	  if (condition1) {
	      // A
	  }
	  else if (condition2) {
	           // B
	  }
	  else {
	    // C
	  }
	  
	  if condition1 is true ==> A
	  if condition1 is false and condition2 is true ==> B
	  if condition1 and condition2 both are false ==> C
	  */
				
	}
}
