package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
	
	public static void main(String[] args) {
		String student1 = "Ibrahim";
		String student2 = "Zuleyha";
		String student3 = "Elina";
		
		String[] allstudents = {"Ibrahim", "Zuleyha", "Elina" };
		
		  allstudents[0]= "Marufjon";
		//  allstudents [3] = "Muhtar";  // We cannot say 3, because it is out of range, max index num is 2.
		  
		  System.out.println(allstudents.length);
		  
		  
    // initialize the size only without giving value:
		  int[] array = new int[4];  // this array can contain 4 values. Its length is 4.
		  
		  System.out.println(array.length);
		  System.out.println(array[0]);
		  System.out.println(array[1]);
		  System.out.println(array[2]);
		  
		  // give values to the array:
		  array[1] = 100;
		  System.out.println(array[1]);
		  
		  array[0]= 200;
		  System.out.println(array[0]);
		  
		  /*
		   array[5] = 500;
		   System.out.println(array[5]);  // out of range. Array's size is fixed.
		   
		   		   */
		  
		  
		//  int[] array2;
		  // System.out.println(array2[0]);     Array's size must be initialized first.
		  
		  Scanner scan = new Scanner (System.in);
		  int [] inputs = new int[5];
		        //  in this array we can store 10 elements
		  
		  for (int i=0; i< inputs.length; i++ ) {
			  System.out.println("Enter a number");
			  inputs[i] = scan.nextInt();
			  }
		  for(int i=0; i< inputs.length; i++ ) {
			  System.out.print(inputs[i]+ " ");
		  }
		  
		  String[]allstudentnames = new String[358];
		  //  this new keyword in array is used to give only the size of the array
		  
	}

}
