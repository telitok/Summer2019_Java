package day10_ifStatement;

public class Nested_if {
	
	
		
		/*
		   Nested if:  when condition contains another condition.
		   
		     if (condition1) {
		            if (condition2) {
		                  // some code to run  ==> this code will be run when condition1 and condition2 are true.
		            }
		     }
		   
		   
		 */
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello Cybertek");    // printed  // if both conditions are true, then both of them are executed.
			if (false) {
				System.out.println("Hello World");
			}
			else {
				System.out.println("Hello Team SDET");  // printed
			}
		}
	
		
		/*
		   grade < 60 ==> Failed
		   60 <= grade < 70 ==> D
		   70 <= grade < 80 ==> C
		   80 <= grade < 90 ==> B
		   90 <= grade <= 100 ==> A
		  50 <= grade < 60 ==> F
		  40 <= grade < 50 ==> G
		  30 <= grade < 40 ==> H
		  20 <= grade < 30 ==> I
		  10 <= grade < 20 ==> J
		  0 <= grade < 10 ==> K
		  
		 */
		
		int grade = 95;
		
		if (grade >= 60) {
			System.out.println("passed");
			
			if (grade >= 90 && grade <= 100) {
				System.out.println("\twith an A");   // \t is for horizontal space
			}
			else if ( grade >= 80 && grade < 90) {
				System.out.println("\twith a B");
			}
			else if ( grade >= 70 && grade < 80) {
				System.out.println("\twith a C");
			}
			else {   // 60 <= grade < 70
				System.out.println("\twith a D");
			}
			
		}
		else {    // either less than 60 or greater than 100
			
			if (grade < 60) {
			System.out.println("You failed with F");
			}
			else { // greater than 100
				System.out.println(" invalid score, error 404");
			}
	}
	}

}
