package day10_ifStatement;

public class ifstatement_withoutCurlyBrace {
	
	public static void main(String[] args) {
		
		/*
		 single if statement:
		   if (condition) {
		      // some codes
		   }
		  
		 */
		
		if (false) {
			System.out.println("Today is Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("There is no java class tomorrow");
		}
		
		if (false)
			System.out.println("Today is Friday");  // without curly braces if statement can have only a single line of code.
		
		System.out.println("Tomorrow there is no class");  // this line does not belong to if statement above.
	
		// we should always use curly braces. we need to know what happens without the curly braces, but always add the curly braces.
		
		if (true)
			System.out.println("Hello");
		
		/*
		   if - else statement:
		   
		        if (condition)
                     // single line of statement
                else 
                     // single line of statement
		 */
		
		if (true)
			System.out.println("Hello");
		
		// System.out.println("Good morning");    if I put a print line between if and else statements, it will give a compile error, because else statement will not be connected to if anymore. So, we cannot put any line between if and else.
		
		else             // only one line of statement (code) without curly braces, just like if statement.
			System.out.println("Hola");
	
		
		/* 
		 Multi-branch if statement without the curly braces:
		 
		       if (condition1)
		            // single line of statement
		       
		       else if (condition2)
		               // single line of statement
		                
		       else 
		             // single line of statement
		 
		 
		 */
		
		if (true)
			System.out.println("if block");
		else if (true)
			System.out.println("else-if block");
		else                                      // else block is not mandatory.
			System.out.println("else block");
		
		
	}
	

}
