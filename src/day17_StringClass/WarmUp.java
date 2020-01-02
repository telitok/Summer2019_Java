package day17_StringClass;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		
		/*
		 Task 01:
		 1. Declare Scanner class' object
		 2. Ask user to enter first and last name
		 3. Declare a string variable called full name
		 4. Concat first and last name and assign it to full name.
		 5. Display in the console total number of characters in full name.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your first and last name");
		String firstname = scan.nextLine(); 
		String lastname = scan.nextLine();
		String fullname = firstname.concat(" "+lastname);
		
		String name = "Cybertek"+12;
		// String name2 = "Cybertek".concat(12);  in concat method you can only give String variable
		                 // or String value
		      int num  = fullname.length();
		System.out.println(fullname+" contains "+num+" characters");
		
		
	}

}
