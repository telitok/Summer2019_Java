package day31_JavaReview;


import java.util.Arrays;
import java.util.Scanner;
public class ArraysReview_MultiDimensional {
    
    /*
     
     
     */
    
    public static void main(String[] args) {
        
    //  ask user to enter numbers and find the maximum and minimum numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to add?");
        int number = scan.nextInt();
        
        int[] arr = new int[number];
        
        
    for(int i=0; i < number; i++) {  
        System.out.println("Enter a number: ");
             arr[i] =  scan.nextInt();  // user input
    }
             
    /*       
        System.out.println("Enter a number: ");
             arr[1] =  scan.nextInt();  // user input  
             
        System.out.println("Enter a number: ");
             arr[2] =  scan.nextInt();  // user input 
        */
        
         System.out.println( Arrays.toString(arr) );
          
          Arrays.sort(arr); 
          System.out.println("Minimum value: "+arr[0]);
          System.out.println("Maximum Value: "+arr[ arr.length-1 ]);
             
         
          
          int [] arr1D = {1,2,3};
          
          // index             0 1 2     0 1 2
          int [] [] arr2D = { {1,2,3} , {4,5,6} };
              // index:        0           1
          
          // [index num of 1D arrays] [index num of each values]
          // print 2:
          System.out.println(arr2D[0] [1]);
          
          // print {4,5,6}:
          System.out.println(arr2D[1]);  // hashcode
          System.out.println(Arrays.toString(arr2D[1]));
          
          // print: { {1,2,3} , {4,5,6} }
          System.out.println(arr2D);  // hashcode
          System.out.println(Arrays.toString(arr2D));  // hashcode
          
          
          // Arrays.deepToString: converts multi dimensional arrays to String values.
          
          String str = Arrays.deepToString(arr2D);
          System.out.println(str);
          
          
          char [] ch = {'a','b','c','d', 'c', 'e'};
          for ( char each : ch) {
        	  if(each == 'c') {
        		  continue;
        	  }
        	  System.out.print(each+" ");
          }
        System.out.println();
        
        String [] [] names= { {"Erhan","Holy","Denis"},{"Muhtar","Mike","Ariya"} };
           // index                     0                           1
        for( String[] each1D : names) {
        //	System.out.println(Arrays.toString(each1D));
        	for (String eachvalue : each1D) {
        		if(eachvalue.equals("Holy") || eachvalue.equals("John-Snow") ) {
                    continue;
                }
                System.out.print( eachvalue  +" ");
            }
        
        
    }
}
}