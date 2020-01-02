package day27_CustomMethods;

public class VoidMethod_WithArgument {
	
	/*
	 methods with argument:
	    
	    access-modifier   specifier   return-type   name(parameter) {
	    
	    
	    }
	    
	    parameters: any data type
	 */
	
	public static void main(String[] args) {
		// oddOrEven();     gives an error because
		        // method was designed to take an argument. 
		        // The method needs an argument in order to perform its task
	
		// oddOrEven(8.5);  // need to provide a value that can be assigned to the parameter
		
		oddOrEven (50);
		
		int z=100;   // variable z's value will be assigned to the parameter variable value
		oddOrEven(z);
		
		// SumOfTwoNums(10); // gives error because does not have enough information
	       
		SumOfTwoNums(10,20);
		
		/* => Write a method that can remove duplicates from the string and prints out the result
		   Ex: RemoveDuplicates("aabbcccccddddaaa")
	    */
	}
	
	public static void SumOfTwoNums (int a, int b) {
		System.out.println("Sum of "+a+" and "+ b+" is: "+ (a+b));
	}
	
	public static void oddOrEven (int a) {
		if(a%2 ==0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}
	}

}
