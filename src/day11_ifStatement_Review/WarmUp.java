package day11_ifStatement_Review;

public class WarmUp {
	
	public static void main(String[] args) {
		
		/*
		 Warm-up:
		 1. Declare an int variable "year".
		 Write a java program that can check if the year is a leap year
		 
		 if a can be divided by 4 && 100 ==> leap year
		 
		 
		 2. grade calculator
		 A => 90~100
		 B=> 80 ~ 89
		 C => 70 ~ 79
		 D => 60 ~ 69
		 F => 0 ~ 59
		 */
			
			int year = 2000;
			boolean LeapYear = year % 4 == 0;
			
			if (LeapYear) {
				System.out.println("Year "+year+" is a leap year");
			}
			else {
					System.out.println("Year "+year+" is NOT a leap year");
				}
			
			
			int grade = 105;
			boolean A = grade >= 90 && grade <= 100 ;
			boolean B = grade >= 80 && grade < 90;
			boolean C = grade >= 70 && grade < 80;
			boolean D = grade >= 60 && grade < 70;
			boolean ValidGrade = grade >=0 && grade <= 100;
			
		if (ValidGrade) {
			if (A) {
				System.out.println("You made an A");
			}
			else if (B) {
				System.out.println("You made a B");
			}
			else if (C) {
				System.out.println("You made a C");
			}
			else if (D) {
				System.out.println("You made a D");
			}
			else {
				System.out.println("You made an F");
			}
		}
		else {
			System.out.println("invalid grade");
		}
			
		/*
		 declare an int variable called Age	
		 declare a boolean variable called "GoodPerson"
		 
	if goodperson is false:
		 Age >= 18 => cigarettes
		 Age >= 21 => hookah
		 Age >= 25 => alcohol
		 Age < 18 => milk 
		 
		 else
		 bad for your health
		 */
		
		int age = 21;
		boolean GoodPerson = false;
		
		if (age >=18) {
			System.out.println("You can buy milk");
			
			if (GoodPerson) {
				System.out.println("Alcohol is bad for your health");
			}
			else {   // GoodPerson = false && age >= 18
				System.out.println("You can buy cigarettes");
				if (age >= 21) { 
					System.out.println("You can buy hookah");
				}
				if (age >= 25) {
					System.out.println("You can buy alcohol");
				}
			}
	     }
		else {
			System.out.println("buy milk");
		}
		
		
		/*
		 1. write a program that can find the number of days in a month.
		 (Assume that Feb has 28 days)
		 
		 int month = 0 ~ 12;
		 
	 1    2    3     4    5     6     7     8      9    10    11   12	 
	Jan, Feb, Mar, April, May, June, July, August, Sep, Oct, Nov, Dec
	 31   28   31   30    31    30    31    31     30   31    30   31
	 
		 MUST use Nested if
		 
		 28 days: 2
		 30 days : 4, 6, 9, 11
		 31 days : 1, 3, 5, 7, 8, 10, 12
		 
		 even number of 30 days : 4 and 6
		 odd number of 30 days : 9 and 11
		 
		 even number of 31 days : 8, 10, and 12
		 odd number of 31 days : 1, 3, 5, and 7
		 */
		
		int  month = 5;
		if ( month > 0 && month <13) {
			if ( month == 1) {System.out.println("31");
		}
			else if (month ==2 ) {
				System.out.println("28 days");
			}
			else if (month == 3) {
				System.out.println("31 days");
			}
			else if ( month == 4) {
				System.out.println("30 days");
			}
			else if ( month == 5) {
				System.out.println("31 days");
			}
			else if (month == 6) {
				System.out.println("30 days");
			}
			else if (month == 7) {
				System.out.println("31 days");
			}
			else if (month % 2 == 0) {
				System.out.println("31 days");
			}
			else {
				System.out.println("30 days");
			}
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		
		/* Another way:
		 28 days : 2
		 30 days : 4, 6, 9, 11
		 31 days : 1, 3, 5, 7, 8, 10, 12
		 
		 Leap year:
		  Feb = 29 days
		 */
		
		int month2 = 2;
		int Year = 2015;
		
	if( month2 > 0 && month2 < 13) {
		if (month2 == 2) {
			if (Year % 4 == 0) {  // condition for leap year
				System.out.println("29 days");
			}
			else {  // condition for regular year
			System.out.println("28 days");
		}
		}
		else if ( month2 == 4 || month2 == 6) {
			System.out.println("30 days");
		}
		else if (month2 == 9 || month2 == 11) {
			System.out.println("30 days");
		}
		else {
			System.out.println("31 days");
		}
	}	
	else {
		System.out.println("Invalid Entry");
	}
	
	// if-else  &&  else-if:
	
		if (true) {  // true
			System.out.println("hello");
		}
		else  {   // false
			System.out.println("Batch 12");
		}
		
		
		
		if (true) {   // true
			System.out.println("hello");
		}
		else if ( false) {    // false
			System.out.println("Batch 12");
		}
		else {   // never gets executed
			System.out.println("Cybertek");
		}
		
		
		/*
		 if (true) {
		 }
		 
		 else {
		 }
		 else if (false) {
		 }
		 
		 this gives compile error, because else if statement should be declared right after if statement.
		 */
		
		int X = 10;
		
		if (X > 0 ) {
			System.out.println("greater than 0");
		}
		if (X>5) {
			System.out.println("Greater than 5");
		}
		if (X == 10) {
			System.out.println("equal to 10");
		}
		
		// if we say else if for the second and third block only the first one gets executed, not the rest.
		
		if (X > 0 ) {
			System.out.println("greater than 0");
		}
		else if (X>5) {
			System.out.println("Greater than 5");
		}
		else if (X == 10) {
			System.out.println("equal to 10");
		}
		
		
		if (true) {
		}  // single if statement should be used for only 1 condition
		
		
		
		if (true) {
		}   
		else {
		}  // if - else statement is used when there is 2 conditions.
		
		
		if ( true) {   // else if statement is used when there is more than 2 conditions
		}
		else if (true) {
	}
		else if (true) {
		}
		else {
		}
		
		
		if (true) {   // nested if is used when the condition has multiple scenarios.
			if(true) {
				// execution of this block depends on the first condition.
			}
		}
	
	}
	
	}
		


