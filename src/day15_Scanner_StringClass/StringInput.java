package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {
	
	/*
	 next vs nextLine() ;  ==> both return String values
	 
	=> next: takes only one word
	=> nextLine takes multiple words
	
	 
	 */
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter your first name");
		String firstname = scan.next();
		System.out.println(firstname);
		
		System.out.println("Enter your last name");
		String lastname = scan.next();
		
		System.out.println("Enter char value");
		   char ch = scan.next().charAt(0);
	}

}
