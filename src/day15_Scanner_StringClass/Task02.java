package day15_Scanner_StringClass;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		/*
		 Write a program that asks user to enter three numbers and returns the largest number
		 Do it with ternary
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1");
		double n1 = input.nextDouble();
		
		System.out.println("Enter num2");
		double n2 = input.nextDouble();
		
		System.out.println("Enter num 3");
		double n3 = input.nextDouble();
		
		double Largest = (n1>n2 && n1>n3)? n1:
			(n2>n1 && n2>n3)? n2: n3;
		
		System.out.println("Largest number is "+Largest);
		
		int z= 10;
		switch(z) {
		case 10: System.out.println("Monday");
		case 11: System.out.println("Tuesday");
		
		default: System.out.println("Friday");
		
		
		}
		
	}

}
