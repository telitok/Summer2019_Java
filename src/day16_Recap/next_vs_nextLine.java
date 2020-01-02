package day16_Recap;

import java.util.Scanner;

public class next_vs_nextLine {
		
	public static void main(String[] args) {
		
	// When we use next(), and enter more than one word as an answer, it only takes the first word and assigns the next word to the next line, so ignores after the first word.
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your first name");
		   String f =scan.next();
		System.out.println("Enter your last name");
		   String L = scan.next();
		   
		 System.out.println("Your first name is "+ f);
		 System.out.println("Your last name is "+L);
	}

}
