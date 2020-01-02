package day18_StringClassContinue;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		
		/*
		 Write a program that asks user's first and last names and then output the initials.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String firstname = input.next();
		input.nextLine();  // takes out the Enter from Scanner's memory
		String lastname = input.nextLine();
		String initials = firstname.substring(0,1).concat(".")+lastname.substring(0,1);  // we wrote it as (0,1), because substring excludes the ending character.
		
	// Another way ==> String initials = ""+firstname.charAt(0)+"."+lastname.charAt(0);
		
		initials= initials.toUpperCase();
		System.out.println("Initial is : "+initials);
		
		String lastletters = ""+firstname.charAt(firstname.length()-1)+
				"."+lastname.charAt(lastname.length()-1);
		lastletters = lastletters.toUpperCase();		
				
				System.out.println("Last letters are: "+lastletters);
		
		
	}

}
