package day16_Recap;

import java.util.Scanner;

public class nextLine {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your phone number");
		int pn = scan.nextInt();
		
		  scan.nextLine();
		String name = scan.nextLine();
// nextLine will take everything in scanner's memory up to the new line.
//    including "Enter".
		
	}

}
