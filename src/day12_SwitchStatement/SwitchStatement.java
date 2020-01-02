package day12_SwitchStatement;

public class SwitchStatement {
	
	/*
	 Switch Statement does the similar thing like multi-branch if statement.
	 
	   switch (Expression) {
	       case CaseValue:
	              statement1
	              statement2
	              break;
	              
	       default:
	           statement;
	           break;
	           
	 // I CAN SWITCH THE SPOT OF CASE NUMBERS (EX: CASE 2 MAY COME FIRST) AND/OR SWITCH THE SPOT OF DEFAULT. IT DOES NOT MAKE A DIFFERENCE. NOT HAS TO BE IN ORDER.
		// We can have many cases, however, we can have only one default.
		// break: is to exit the switch statement. Closing the statement. 
		// If there is no break in switch statement, code will continue to run until it exits the switch statement. 
	
	 */
	
	public static void main(String[] args) {
		
		int score = 3;
		if ( score == 1) {   // must give boolean expression
			System.out.println("1");
		}
		else if (score == 2) {
			System.out.println("2");
		}
		else {
			System.out.println("invalid");
		}
		
		
		switch (score) {  // must give an expression : a data type
		   case 1:
			   System.out.println("1");
		       break;
		   case 2:
			   System.out.println("2");
			   break;
			   
		   default:
			   System.out.println("invalid");
			   break;
		}
		
		String str = "Java";
		
		switch (str) {
			default:
				System.out.println("Invalid");
				break;
			
			case "C#":
				System.out.println("C# programing language");
				break;
			//	System.out.println("C# programming language");
			//  after break statement, we cannot give any other statements for switch, because case was closed with the break.
			case "Python":
				System.out.println("Python programing language");
				break;  
		}
		
		char grade = 'A';
		switch (grade) {  
			
			case 'B':
				System.out.println("Passed with B");
				
			case 'C' : 
				System.out.println("Passed with A");
				
			default:
				System.out.println("Failed");
				
		}  // switch statement only exits when there is break statement or a closing curly brace.
		
		int number =10;

		if(--number > 10) {

		System.out.println("Hello Cybertek "+number);

		}else if(number ==9) {

		System.out.println("Hello World "+number);


	}
		boolean X = true;

		boolean Y = !X==false;

		boolean Z = Y;

		 

		if( X ) {

		System.out.println("Hello Everyone");

		} if( Y ) {

		System.out.println("Today is great day");

		} if( Z ) {

		System.out.println("We have picnic on Saturday");
	
		
		}
	}
}
