package day27_CustomMethods;

import java.util.Arrays;

public class WarmUp {
	
	/*
	 Warm up:
	    1. Create an int array called numbers that has length of 100
	    2. Assign 1~100 to the array' each indexes
	    3. Use for each loop to print out all the even numbers
	    4. Must use continue statement
	 */
	
	public static void main(String[] args) {
		int[] numbers;
		numbers = new int [100];
		
		for (int i = 1; i<=100; i++) {
			numbers [i-1] = i;
			// each value of "i" will be assigned to the index number of (i-1)
	    // numbers[0]=1
		 // numbers [1]=2;
			}
		System.out.println(Arrays.toString(numbers));
		
		for(int each: numbers) {
			if(each%2 != 0) {
				continue;
			}
			System.out.print(each+" ");
		}
	}

}
