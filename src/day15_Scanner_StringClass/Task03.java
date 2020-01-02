package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/*
		 Write a program that asks user to enter first name and 
		 the last name. At the end system should display full name.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name");
		    String firstname = input.nextLine();
		
		    System.out.println("Enter your last name");
		    String lastname = input.nextLine();
		    
		    String fullname = lastname+" "+firstname;
		    
		    System.out.println("Your full name is: "+lastname+" "+firstname);
	
	     input.close();  // closes the scanner and gets rid of warning of the scanner class
	
	
	
	
	
	}
	

	
	
}
