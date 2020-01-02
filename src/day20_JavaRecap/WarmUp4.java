package day20_JavaRecap;

import java.util.Scanner;

public class WarmUp4 {
	
	public static void main(String[] args) {
		
		/*
		 4. write a program that asks user to enter number 5 times:
            
              2. find the maximum number and the minimum number
       
		 */
		Scanner scan = new Scanner(System.in);
		int min = 99999999;  // store the minimum user input value
		
		for( int i=1; i<=5; i++) {
		System.out.println("Enter a number");
		int inputNum = scan.nextInt();
		if(inputNum < min) {
			min = inputNum;
		}
		}
		System.out.println("max value is: "+min);
	}

}
