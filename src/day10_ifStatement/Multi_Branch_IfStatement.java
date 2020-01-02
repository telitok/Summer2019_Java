package day10_ifStatement;

public class Multi_Branch_IfStatement {
	
	 /*
	  Multi-branch if statement: we use them when there are more than two possibilities.
	  
 if-else if-else:
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
	
	public static void main(String[] args) {
		
		if (false) {
			System.out.println("if block");
		}
		else if (true) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		
		
	/*
	 Task 01:
	   90 <= grade ==> A
	   80 <= grade < 90 ==> B
	   70 <= grade < 80 ==> C
	   60 <= grade < 70 ==> D
	   else ==> F
	   
	 */
		int grade = 85;
		
		if (grade >= 90) {
			System.out.println("You made A, great job");
		}
		else if (grade < 90 && grade >= 80) {
			System.out.println("You made B, good");
		}
		else if (grade < 80 && grade >= 70) { 
			System.out.println("You made C, that's okay");
		}
		else if ( grade <70 && grade >= 60) {
			System.out.println("You made D, really?");
		}
		else {
			System.out.println("You made F, study more");
		}
		
		// Find the bug:
		
		int grade2 = 90;  // Since this grade is greater than 60, and first line below says if grade is greater than 60, it is D. 
		                  //   That's why it gives a D when we run it which is the bug.
		
		if ( grade2 >= 60 ) {  // if ( grade2 >= 60 && grade2 < 70)
			System.out.println("D");
		}
		else if ( grade2>= 70) {   // else if ( grade2 >= 70 && grade2 < 80 )
			System.out.println("C");
		}
		else if ( grade2 >= 80) {  // else if (grade2 >= 80 && grade2 < 90 )
			System.out.println("B");
		}
		else if ( grade2 >= 90) {  
			System.out.println("A");
		}
		else {
			System.out.println("F");
		}  
		
	/*
	 
	 Task 02:
	   1. Write a program that:
	       1. 0 ~ 12 ==> good morning
	       2. 12 ~ 15 ==> good afternoon
	       3. 15 ~ 23 ==> good night
	       4. 12 ==> good noon
	 
	 */
		int hour = 12;
		
		if (hour >= 0 && hour < 12) {
			System.out.println("Good morning");
		}
		
		else if (hour > 12 && hour <= 15) {
			System.out.println("Good Afternoon");
		}
		else if (hour > 15 && hour <= 23) {
			System.out.println("Good night");
		}
		else {
			System.out.println("noon");
		}
		
		/*
		 Task: 
		  int num1 , num2, num3,
		      find the bigger number
		  
		 */
		
		int num1 = 200, num2 = 300, num3 = 50 ;
		
		if (num1>num2 && num1 > num3) {
			System.out.println("num1 is the bigger number");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is the bigger number");
		}
		else if ( num3 > num2 && num3 > num1) {
			System.out.println("num3 is the bigger number");
		}
		else if ( num3 == num2 && num3>num1) {
			System.out.println(num3 + " and "+num2+ " are the bigger numbers");
		}
		else if (num3 == num1 && num3 > num2) {
			System.out.println(num3 + " and "+num1+ " are the bigger numbers");
		}
		else if ( num2 == num1 && num2 > num3) {
			System.out.println(num2 + " and "+num1+ " are the bigger numbers");
		}
		else {
			System.out.println("all of them are equal");
		}
		
	
		}
		
		
	}


