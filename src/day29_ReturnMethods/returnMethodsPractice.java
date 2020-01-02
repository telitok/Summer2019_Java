package day29_ReturnMethods;

import java.util.Arrays;

public class returnMethodsPractice {
	
	public static void main(String[] args) {
		sum(10,20);
		
		// in max = sum(10,20);  //  the method does not return any value
		
		addition(10,20);   // this method is an int value
		
		System.out.println(addition(10,20));
		
		int num = addition(10,20);
		System.out.println(num);
		
		int max=(int) greaterNumber(90,200,30);
		System.out.println(max);
		
		int [] arr = {20,30,1,2,3,5,9};
		int maxNum = maximum(arr);
		System.out.println(maxNum);
		
		String[] names= {"emrah", "zulfie", "waris", "mehmet", "Aktoty", "yusuf", "Djalolitdin", "Munevver"};
	    System.out.println(Longest(names));
	    
	    
	    int [] array= {1,2,3,4,5,6,7};
	      array = Sort(array);
	      System.out.println(Arrays.toString(array));
	    
	    
	}
	
	// write a method that accepts an int array and returns the max number from that array
	
	public static int maximum(int[] arr ) {
		Arrays.sort(arr);
		return arr[arr.length-1];
		
	}
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	// write a method that accepts 3 numbers and returns the largest number
	
	public static double greaterNumber(int a, int b, int c) {
		int [] arr = {a, b, c};
		Arrays.sort(arr);
		return arr[arr.length-1];
		
		
	}
	   //1. write a method that accepts String array, and returns the longest String value form the array
    public static String  Longest(String[] arr) {
        
        String longWord ="";
        
        int max=0;
        for(int i=0; i < arr.length; i++) {
            if( arr[i].length()>max ) {
                max = arr[i].length();
                longWord = arr[i];
            }
        }
         return longWord;
    }
       
       
    // write a method that accepts an int array and sorts it then retuns an array
       
       public static int[] Sort(int[] arr) {
                                   //[5,3,2,22,3};
           Arrays.sort(arr);  //[2,3,3,5,22];
           int[] numbers = new int[arr.length]; // numbers array has same length with the arr
           
           int z =0;
           for(int i = arr.length-1; i >= 0; i--  ) {
                        numbers[z]= arr[i];
                        z++;
           }
           
           return numbers;
       }
}
