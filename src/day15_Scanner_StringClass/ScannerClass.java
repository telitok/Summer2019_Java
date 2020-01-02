package day15_Scanner_StringClass;

import java.util.Scanner;

public class ScannerClass {
	
	/*
	 Scanner is used for reading user data
	 in order to use Scanner, we need to import it first from its package
	 
	 import java.util.Scanner;  ==> imports the Scanner class only from the java.util package
	 
	 The import statement must be placed between package name and class name, it should be outside the class.
	 
	 
	 wild import:
	  import java.util.*;  => imports all the classes located in the java.util package.
	  
	 Declaration of Scanner class: 
	         Scanner variableName
	         
	         variableName = can reference an object of scanner class
	         
	         new Scanner (System.in): creates an object
	  
	 
	  Scanner methods:
	      
	      variableName.nextByte():  ==> returns the user input as byte value
	      variableName.nextShort():
	      variableName.nextInt():   ==> used more often
	      variableName.nextLong():
	      variableName.nextBoolean():    ==> not used very often
	      variableName.nextDouble():
	  
	 */
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("enter byte value");
		
		byte num = input.nextByte();  // returns the user input as byte
		        
		
		System.out.println("enter short value");
		 short num2 = input.nextShort();
		 
		 System.out.println("enter int value");
		 int num3 = input.nextInt ();    // we need to put numbers (data) in the parenthesis for byte, short, long, and int
		 
		 System.out.println("enter long value"); 
		 long num4 = input.nextLong();
		 
		 
		 System.out.println("enter boolean value");
		 boolean result = input.nextBoolean();   // we need to put true or false in the parenthesis, nothing else.
		 
		 
		 System.out.println("enter float value");
		 float num5 = input.nextFloat();
		 
		 
		 System.out.println("enter double value");
		 double num6 = input.nextDouble();
		 
		 
		 System.out.println("enter your first name");
		 String str = input.nextLine();
		 
		        
	}

}
