package day10_ifStatement;

public class Single_IfStatement {
	
	public static void main(String[] args) {
		
		/*
		 single if : 
		       if (boolean expression) {
		             // A
		       }
		 */
		
		if (9>8) {
			// true
			System.out.println("9 is greater than 8");
		}
		
		if (9<8) {
		 // false
			System.out.println("8 is greater than 9");
		}
		
		System.out.println("Test Completed");  // does not belong to any if block.
		
		// Task 01:
		int num1 = 100;
		int num2 = 300;
		int max = 0;  // local variables needs to be initialized before using them.
		
		if (num1 > num2) {  // means that num1 is greater than num2
	 //    false
			max = num1;
		}
		
		if (num2 > num1) {
			max = num2;  // max = 300
		}
		
		System.out.println("Maximum number between "+num1 +" and "+
				num2+" is " +max);
		
		// Task 02:
	    int hours = 11;
	    int minutes = 45;
	    int seconds = 30;
	    
	    String amOrpm = "pm";
	    
	    if(hours>11) {
	    	System.out.println("invalid hour");
	    	
	    }
	    
	    if (hours <= 11) {
	    	System.out.println(hours+":"+minutes+":"+seconds+" "+amOrpm);
	    }
	    
		
	    // Task 03:
	       int n1 = 1000, n2 = 5000, n3 = 900;
	       int maximum = 0; // we can give any value to max at this point. We just need to initialize a value to this variable in order to avoid getting an error.
	       
	       /*
	        in order n1 to be the maximum: n1 > n2 && n1 > n3
	        in order n2 to be the maximum : n2 > n1 && n2 > n3
	        in order n3 to be the maximum : n3 > n1 && n3 > n2
	        */
	       
	       if (n1 > n2 && n1 > n3) {
	    	   maximum = n1;
	       }
	       
	       if (n2 > n1 && n2 > n3) {
	    	   maximum = n2;
	       }
	        if (n3 > n1 && n3 > n2) {
	        	maximum = n3;
	        }
	        
	        String result = "Maximum number between "+n1+", "+n2+", and "+n3+" is "+maximum;
	        System.out.println(result);
	        
	        // Or print it as below
	      
	       System.out.println( "Maximum number between "+n1+" , "+n2+" , "+
	    		   " and "+n3+" is "+maximum);
	    
	       System.out.println(maximum);
	       
	       // solution 2:  This is a more limited solution. For example: If we need to multiply the max number with any other number it will be harder to write the codes, etc.
	    if (n1 > n2 && n1 > n3) {
	    	System.out.println("Maximum number is "+n1);
	    }
	    
	    if (n2 > n1 && n2 > n3) {
	    	System.out.println("Maximum number is "+n2);
	    }
	    
	    if (n3 > n1 && n3 > n2) {
	    	System.out.println("Maximum number is "+n3);
	    }
	    
	    
	    int A;
	    if (true) {
	    A=12;
	    }
	    System.out.println(A);  // local variables must be initialized before used.
	    
	    
	    
	  double B;
	     if (false) {
	    	 B=100;  // it would give error when we try to print it, because we gave a value within the if statement.
	     }
	  
	  // System.out.println(B);   gives error
	     
	     
// Task 04:
	     int statusCode = 200;
	     String finalResult = "invalid status code";
	     
	     if (statusCode == 200) {
	    	 finalResult = "ok";
	     }
	     
	     if (statusCode == 201) {
	    	 finalResult = "created";
	     }
	     
	     if (statusCode == 404) {
	    	 finalResult = "not found";
	    	 }
	     System.out.println("status code "+ statusCode+" is: "+finalResult);
	     
	// Task 05 :
	     
	     int number = 400-500;
	     String str = "zero";
	     
	     /*
	      number to be positive: number > 0
	      number to be negative : number < 0
	      number to be zero : number == 0
	      
	      */
	     if (number > 0) {
	    	 str = "positive";
	    	 System.out.println(number + " is "+ str);
	     }
	     
	     if ( number < 0) {
	    	 str = "negative";
	    	 System.out.println(number+" is "+ str) ;
	    	 
	     }
	     
	     int number2 = 5000;
	     
	     if (number2 > 0) {
	    	 System.out.println("Positive");
	     }
	     
	     if (number2 <0) {
	    	 System.out.println("Negative");
	     }
	     if (number2 == 0) {
	    	 System.out.println("Zero");
	     }
	     
	     
	
	    
	}
	
	
	
	    


		
	

		
		
		
}	
		
		
	

