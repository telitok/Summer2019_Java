package day18_StringClassContinue;

public class StringMethods_Boolean {
	
	public static void main(String[] args) {
		
		
		/*
		 isEmpty(): checks if the string is empty,
		            and it returns a boolean expression.
		            
		 */
		
		String str = "Cybertek";
		   boolean R1 = str.isEmpty();  // False
		   System.out.println(R1);
		   
		  String str2 = "";
		   if(str2.isEmpty()) {  // True
			   System.out.println("it's empty String");
		   }
		   else {
			   System.out.println("it's not empty");
		   }
		   
		   
	   /*
	    equals(str): checks if two Strings' visible texts are equal or not.
	    */
		   
		   String A1 = "Cybertek";
		   String A2 = new String ("Cybertek");
		   System.out.println(A1 == A2);  // false
		   
		     boolean R2 = A1.contentEquals(A2);
		     System.out.println(R2);
		     
		   System.out.println( "java".equals("Java"));  // false, because of case sensitivity
		   
		   
		   /*
		    equalsIgnoreCase(str): 
		         checks if two Strings' visible texts are equal or not,
		         then returns a boolean expression.
		         Case sensitivity does not matter.
		    */
		   
		   String s1 = "JAVA";
		   String s2 = new String("java");
		   System.out.println(s1 == s2);  // false
		   
		   System.out.println(s1.equals(s2));  // false
		   System.out.println(s1.equalsIgnoreCase(s2));  // true
		   
		
		
	    /*
	     contains(str): checks if the str is contained in the String or not,
	                    then it returns a boolean expression.
	     
	     if it is contained ==> true
	     if it is !contained ==> false
	     */
		   
		   String name = "Muhtar";
		      boolean Result = name.contains("ABC");  // false
		      System.out.println(Result);
		      
		    String name2 = "Marufjon";
		    System.out.println(name2.contains("m"));  // false, case sensitivity
		    
		    
		    
		    /*
		     startsWith(str): checks if the String is started with the str or not,
		                      then returns a boolean expression.
		     
		     startedwith ==> tru
		     !startedwith ==> false
		     */
		    
		    String today = "Java";
		   boolean result =  today.startsWith("J");
		   System.out.println(result);  // true
		   
		   String names = "Cybertek School is a great place to learn Java";
		   System.out.println(names.startsWith("Cybertek School"));  //true
		   
		   
		   /*
		    endsWith(str): checks if the String is ended with the given str or not, 
		                   then returns a boolean expression.
		    
		    endedwith ==> true     !endedwith ==> false
		    
		    */
		   
		   String B1 = "Muhtar";
		   System.out.println(B1.endsWith("R"));  //false, case sensitivity
		   System.out.println(B1.endsWith("r"));  // true
		   
		   
				   
		   
		   
	}

}
