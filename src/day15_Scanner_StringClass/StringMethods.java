package day15_Scanner_StringClass;

public class StringMethods {
	
	/*
	 String methods:
	    charAt(indexnum) : it takes the index number and returns its character as char value
	              Ex: String str = "Cybertek";
	              Index number:     01234567
	              
	              str.charAt(5)b== returns 't';
	    
	    length(): returns the total number of characters as an int value.
	               Ex: String str = "Cybertek";
	               str.length() ==> 8
	    
	    concat(str): it takes a String and concats it to the String variable.
	                 And returns a NEW String value.
	                    Ex: SString str = "Cybertek";  ==> Cybertek
	                    str.concat(" School");  ==> Cybertek School
	                    
	                    
	    toUpperCase(): converts to upper case, and returns a NEW string value.
	 
	 
	    toLowerCase():
	 
	 */
	
	public static void main(String[] args) {
		
		String str = "Cybertek";
		// index num: 01234567
		
		  // charAt(index):
		
		     System.out.println(str.charAt(4));  // this will print "r"
		     
		       char ch = str.charAt(4);
		       System.out.println(ch);  // this will print r as well.
		       
		     String str2 = "Mu htar";
		  // index numbers: 0123456
		     System.out.println(str2.charAt(2));
		
		     
		     
		// length():
		     
		     String name = "Donald J Trump";  // 14 characters including the spaces.
		     System.out.println(name.length());  // tells me how many characters in the string above, including the spaces.
		  
		     
		// concat():
		     String s1 = "Cybertek";
		        s1.concat("School");  // attempted to modify it
		        System.out.println(s1); // prints the original String, Cybertek. Because String is immutable, meaning cannot be modified.
		        
		        // Then what does concat do? It creates a new value and concats the message to the original
		        
		        s1 = s1.concat(" School");  // we assigned a new value to s1.  Now s1 = Cybertek School
		        System.out.println(s1);
		  
		        
		// toUpperCase():
		        String N = ("cybertek");
		        N.toUpperCase();  
		        System.out.println(N);  // gives still cybertek, because String is immutable.
		        
		       N=N.toUpperCase();
		       System.out.println(N);  // prints CYBERTEK
		       
		       
		// toLowerCase():
	
	}

}
