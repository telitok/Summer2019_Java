package day23_Arrays;

public class ArraysClass {
	
	public static void main(String[] args) {
		
		/*
		 Arrays: a variable that we can store multiple values.
		  
		   > Each value (element) in an array has its own index number.
		     int [] variablename = {10, 20, 30, 40, 50};
		     //  index num:         0    1   2   3   4
		   
		   > To retrieve the data of the array:
		      
		      variablename[IndexNumber of data]:
		      
		          variablename[3] ==> 40
		          variablename[1] ==> 20
		          
		   > An array is immutable, and array's size is fix.
		       		  
		 */
		
		int[] arr = { 1,2,3};
		String[] names= { "Nigar", "Sumeyya", "Madina", "Juline" };
		//                  0          1         2         3
		
		System.out.println(names[0]);  // prints Nigar
		System.out.println(names[1]);  // prints Sumeyya
		
		String str1 = names[2];
		String str2 = names[3];
		
		System.out.println(str1);
		System.out.println(str2);
		
		double[] myarray = {1, 2, 3, 4, 5, 8, 0, 2};
		//  index num       0  1  2  3  4  5  6  7
		
		for (int i= 0; i<8 ; i++) {
			System.out.print(myarray[i]+ " ");
		}
		System.out.println();
		
		// length of Array:
		String str = "ABC";
		  int A = str.length();
		  System.out.println(A);
		  
		int [] numbers = {12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		       int B = numbers.length;		
		         System.out.println(B);
		         int highestindexnum = numbers.length - 1;
		         
		      System.out.println(highestindexnum);
		      
		      for (int i = 0; i< numbers.length; i++) {
		    	  int s1 = numbers[i];
		    	  System.out.print(s1+" ");
		    	  
		      }
		    System.out.println();
		    
		    char [] myChars = {'A', 'B', 'C', 'D'};
		    int HighestIndexNum = myChars.length - 1;
		    System.out.println(HighestIndexNum);
		    
	}

}
