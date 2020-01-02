package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
	
	/*
	 split(str) : splits the String by the given value, and returns it as String arrays.
	 
	 
	 toCharArray(): 
	 */
	
	public static void main(String[] args) {
		
		String sentence = "Today is a great day, Good day to learn java";
		
		     String [] arr = sentence.split(" ");
		   System.out.println(Arrays.toString(arr));
		     
	    String email = "Firstname_Lastname";
	       String [] arr2 = email.split("_");
	       
	       String str = Arrays.toString(arr2);
	       System.out.println(str.replace("[", "").replace("]", ""));
	       
	       
	       String fullname = "Cybertek School Batch12";
	        String [] array1= fullname.split(" ");   // There are two spaces
	        System.out.println(Arrays.toString(array1));
	     
	     
	      String Java = "I love Java and Java is fun, Java is life";
	       String [] array2 =  Java.split("Java");
	       System.out.println(Arrays.toString(array2));
	       System.out.println(array2.length-1);   // This is equal to number of occurrences of Java
	       
	       
	       String python = "Python is good, I love Python, Python is Life";
	       String [] array3 = python.split("Python");
	       System.out.println(array3.length-1);
	       
	       String emailaddress = "Cybertek_school_batch12@gmail.com";
	       emailaddress = emailaddress.substring(0,emailaddress.indexOf("@"));
	       String [] array = emailaddress.split("\\.");
	       
	       System.out.println(Arrays.toString(array));
	       
	       
	       String word = "ABCDEFG";
	         String [] allcharacters = word.split("");
	         System.out.println(Arrays.toString(allcharacters));
	         
	     /*
	      toCharArray(): returns a char array from the String
	      */
	       
	         String Str = "Java";
	           char[] ch =Str.toCharArray();
	           
	           System.out.println(Arrays.toString(ch));

	}

}
