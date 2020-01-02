package day28_JavaRecap;

import java.util.Arrays;

public class WarmUp {
	
	/*
	 warm Up:  
    1. write a method that can convert km to miles
               1 km = 0.612 mile
               
    2. write a method that can convert gallons to litters
               1 gallon = 3.75 liters
               
    3. write a method that can print out an array in descending order.
	 */
	
	public static void main(String[] args) {
	//	KmToMiles(); // gives error because there is not enough info to perform the task
		
		KmToMiles(10);  // we have to provide a number in the parenthesis so it can convert
		
		GallonToLiter(85.5);
		
		int [] arr = {0, -1, 1000, 2000, 5000};
		
		SortDes(arr);
	}
	
	
	
	// Question 1:
	public static void KmToMiles(double km) {
		
		double miles = km*0.612;
		System.out.println(km+" km equals to "+miles+" miles.");
		
	}
	
	// Question 2:
	
	public static void GallonToLiter(double gallons) {
		
		double liters = gallons * 3.75;
		System.out.println(gallons+" gallons equal to "+liters+" liters.");
		
	}
	
	// Question 3:
	
	public static void SortDes(int [] array) {
		
		Arrays.sort(array);
		for(int i=array.length-1;i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		
	}

}
