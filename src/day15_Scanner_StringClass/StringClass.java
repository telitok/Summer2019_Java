package day15_Scanner_StringClass;

public class StringClass {
	
	public static void main(String[] args) {
		
		
		/*
		 String class:
		   1. String is an object
		      There are two ways to create object from  
		      String class:
		         1. String literals
		               String str = "Cybertek;
		               
		         2. by using "new" keyword
		                String str = new String("Cybertek");
		         
		   When the object is created by String literals, that object will be saved
		    in the String pool (string pool does not take duplicates)
		    
		    When the String object is created by using "new" keyword, the object will be 
		    saved in the java heap memory (not in the string pool)
		    
		    Every time when we use a new keyword, compiler will create a new object in java heap memory.
		    
		    
		    2. String object represents the sequences of characters: ==> "ABCDEFG"
		            Each character in String has its own index number.
		            Index numbers start from 0.
		            
		            String str = "Cybertek";
		          index numbers:  01234567
		          
		    3. String is immutable:
		          Once you declare it you cannot modify it.
		          
String methods:
        charAt(indexnum):
		 
		 */
	 
		String str = "Ceybertek";
		String A = "Cybertek";
		String B = "Cybertek";
		System.out.println(A==B);   // true
		// both string literals are stored in the string pool
		
		String str2 = new String ("Cybertek");
		System.out.println(str == str2);   // false, because two objects are created in different memory locations
	
		String str3 = new String ("Cybertek");
		System.out.println(str2 == str3);    // false
		
		
		String s1 = "cat";
		String s2 = "cat";
		System.out.println(s1==s2);   // same memory locations, thats why it is true
		
		String s3 = new String("cat");
		String s4 = new String ("cat");
		System.out.println(s3==s4);   // different memory locations in the java heap memory, that's why it is false.
		
		
		System.out.println(s1==s4);  // false, different memory
		
		
		String a = "Batch12";
		String b = "batch12";
		System.out.println(a==b);  // false, case sensitivity
}

}
