package day28_JavaRecap;

import java.util.Arrays;

public class ArraysReview {
	public static void main(String[] args) {
		
	
	/*
	 single dimensional array:
	         int [] arr1D = {1,2,3,4};
	         int arr1D [] = {1,2,3,4};
	         int arr1D [] = new int [] {1,2,3,4};
	 */
		
	// int [] arr1D = new int [] {1,2,3,4};
		int arr1D [] = {1, 2, 3, 4};
	//	index:          0  1  2  3
		System.out.println(arr1D[2]);  // 3
		
	// initialize the size of 1D array: int[] arr = new int [length number]
		int [] arr = new int[3];
		// this array can contain 3 values
		arr[1] = 10;   // [0, 10, 0]
		arr[0] = 30;   // [30, 10, 0]
		arr[2] = 40;   // [30, 10, 40]
	//	arr[3] = 50;   // if we add this one it will give error saying index is out of bound, because we initialized the size of array as 3.
		
		
		// to print the array: array needs to be converted to String
		System.out.println(Arrays.toString(arr));
		
		
		int [] numbers = { 10, 20, 30, 40};
		
		for( int eachValues : numbers) {
			if(eachValues == 20) {
				continue;
			}
			System.out.println(eachValues+" ");
			break; // it will print only 10, because it will exit the loop after the first execution.
		}
		
		
		int [] nums = {100, 200, 300, 400};
		
		for(int i =0; i< nums.length;i++) {
			if (nums[i] ==300) {
				break;
			}
			System.out.print(nums[i]+ " ");  // 100, 200
		}
		
		
	

}
}