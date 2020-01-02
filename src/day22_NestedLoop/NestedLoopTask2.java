package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoopTask2 {
	public static void main(String[] args) {
		
	while (true) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Do you want to continue?");
		    scan.nextLine();  // since we used nextLine below, we need to give this here to remove the Enter, because nextLine below takes Enter as well
		   
		String answer = scan.nextLine();
		while (!(answer.equals("yes") || answer.equals("no"))) {
			System.out.println("Please make up your mind");
			System.out.println("Do you want to continue");
			answer=scan.nextLine();  // allows the user to enter an answer again
		
		if (answer.equals("no")) {
			break;
		}
	}
		
		/*
		 Write a program that asks user if s/he wants to: *, /, %, - , +
		 
		 Then ask user to enter two numbers
		 
		 Then return the result on the console
		 
		 Then ask the user if they want to continue to do another math
		 if yes, repeat the previous steps
		 if no, exit the system
		 For any other answers, ask the user to re-enter an answer
		 */
	}
	}

}
