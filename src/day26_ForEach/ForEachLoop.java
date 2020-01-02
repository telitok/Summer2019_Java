package day26_ForEach;

import java.util.Arrays;

public class ForEachLoop {
	
	/*
	 For Each Loop:
	        used to access the value in a collection of values.
	        It is a loop that's been already iterated.
	        For Each Loop can never be infinite!
	  
	  Syntax of for each loop:
	       for (DataType each: VariableNameOfCollection) {
	       }                    // ArrayName
	 */
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		for (int i= 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		System.out.println("=======================");
		
		for (int each : arr) {
			System.out.println(each);
		}
		
		String [] str1 = {"A","B","C", "D", "F"};
		for( String values : str1 ) {
			System.out.println(values);
		}
		
		char [] ch = {'z', 'x', 'y', 'c', 'a', 'b'};
		Arrays.sort(ch);
		
		for(char charzz : ch) {
			System.out.print(charzz);
		}
		System.out.println();
		
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		for(int varname : arr1 ) {
			if (varname%2==0) {
			System.out.print(varname+" ");
		}
		}
		System.out.println();
	}

}
