package day19_ForLoop;

public class ForLoop {
	public static void main(String[] args) {
		
		/*
		 Loop : Used for repeated actions, repeats the steps multiple times.
		        1. For Loop
		        2. While Loop
		        3. Do While loop
		        
	  1. For loop:
	  
		 for ( initialization; condition; iterator ) {
		      
		      statements that you want to repeat
		      }
		      => The statement within the loop's body is repeated until condition becomes false.
		
		 Initialization: usually the times of the number that we want to execute the loop.
		     Starting point
		     int i = 0;
		     
		 Condition: condition is created based on the initialization.
		     Ex: i < 10
		  
		  Iterator: co-related to the condition, runs long enough and either increases or decreases ...
		  > Needs to be capable  to make the condition false, so loop would stop at some point.
		            i++
		 
		 */
		
		for( int i=10; i>0; i--) {
			System.out.println("Value of i is :"+ i);
		}
		System.out.println("Winter is here");  // if loop continues forever, this never gets printed. Iterator puts a limit to the print times of the loop so next line can be printed.

		for (int i =1; i <=10; i++) {
			System.out.println("the square of "+i+ "is "+ (i*i));
		}
	}

}
