package day12_SwitchStatement;

public class IfStatement_WithoutCurlyBraces {
	
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		else {
			System.out.println("World");
		}
		
		// without the curly braces = a single line of statement
		
		if (true)
			System.out.println("Hello");
		 // System.out.println("Hello");  if we add another statement here, the else statement below gives a compile error. Because
		//                                without curly braces if statement can have only a single line of statement. the second line breaks the connection between if and else.
		else 
			System.out.println("World");
		
		
		if (true) {
			if (true) {
				System.out.println("Hell World");
			}
			else {
				System.out.println("Hello cybertek");
			}
			
		}
		
		System.out.println("==============");
		
		if (true)
			if (true)
				System.out.println("Hell World");
			else
				System.out.println("Hell Cybertek");
		else
			System.out.println("Invalid");
		
		
		
		// multi-branch if:
		
		int grade = 80;
		if (grade <= 100 && grade >= 0) {
			if (grade >= 90) {
				System.out.println("A");
			}
			else if ( grade >= 80) {
				System.out.println("B");
			}
			else if (grade >= 70) { 
				System.out.println("C");
			}
		}
		else { 
			System.out.println("Invalid Entry");
		}
			
		
		
		
		
	if (grade <= 100 && grade >= 0)
		if (grade >= 90) 
			System.out.println("A");
		else if ( grade >= 80) 
			System.out.println("B");
		else if (grade >= 70) 
			System.out.println("C");
		else // this else statement belongs to the "else-if" statements
			System.out.println();  
	else // this else statement belongs to the pre-condition.
		System.out.println("Invalid Entry");
		
	}
	
	

}
