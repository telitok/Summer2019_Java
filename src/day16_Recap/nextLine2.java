package day16_Recap;

import java.util.Scanner;

public class nextLine2 {
	
	public static void main(String[] args) {
		
		
		/*
		 Write a program that accepts zip code, city, state, phone number
		 and then display all those gathered info on the console.
		 
		 Do not use next() method.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your zip code");
		  int zipcode = input.nextInt();
		  //  123456 Enter
		  input.nextLine(); // takes out the Enter, If I do not add this one as soon as I put my zipcode and hit enter,
		                    // it shows city name and phone number together. After I added this line, it asked me one by one.
		  
		System.out.println("Please enter your city name");
		    String cityname = input.nextLine();
		    
		    
		 System.out.println("Enter your phone number");
		   int pn = input.nextInt();
		   
		 System.out.println("Enter your State");
		 String stateName = input.nextLine();
		 
		 input.nextLine();
		 
		 System.out.println("zipcode is "+zipcode);
		 System.out.println("City name is "+cityname);
		 System.out.println("Your phone number: "+pn);
		 System.out.println("Your state is "+stateName);
		}

}
