package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {
	
	public static void main(String[] args) {
		
		
		int num=10;
		System.out.println(num);
		
		int [] arr = {1, 2, 3} ;
		System.out.println(arr);
		
		/*
		 To print entire array as whole, we need to convert the array to String.
		 Arrays.toString(VariableName) : used for converting single dimensional arrays to String value.
		 
		 Array class is presented in java.utils package
		 */
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		String[] names = {"Elvira", "Bibish", "Tural", "Daulet", "Hakan"};
		System.out.println(names[0]);
		System.out.println(names); // This will print some hash codes
		System.out.println(Arrays.toString(names));
		
		
		/*
		 Arrays.sort(variableName):
		     sorts the values of the array in ascending order ( from smallest to largest)
		     
		 */
		int [] Numbers = {9, 8, 100, 3000, 4, 5, 6};
		System.out.println(Arrays.toString(Numbers));
		
		Arrays.sort( Numbers );
		System.out.println(Arrays.toString(Numbers));
		
		System.out.println("Maximum: "+Numbers[Numbers.length-1]);
		System.out.println("Minimum: "+Numbers[0]);
		
		
		String[] NameList = {"Alma", "Enes", "Myra", "Smith", "Sarah", "Lexi", "ABC"};
		Arrays.sort(NameList);  // sorts based on alphabetical order (from ASCII table)
		
		System.out.println(Arrays.toString(NameList));
		
		char[] ch = {'0', '9', '8', '5', '3', '2', '1'};
		Arrays.sort(ch);
		
		System.out.println(Arrays.toString(ch));
		
		
		int[] nums = {2000, 90, 89, 78, 65, 5555, 444, -5};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println("Minimum number: "+nums[0]);
		System.out.println("Maximum number: "+nums[nums.length-1]);
		System.out.println("Second maximum number: "+nums[nums.length-2]);
		System.out.println("Second minimum number: "+nums[1]);
		
		
		/*
		 Write a program that can print the arrays in descending order (from largest to smallest)
		 */
		
		int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
        Arrays.sort(MyNumbers);
                // MyNumberw -> [10, 40, 50, 99, 200, 3000, 5000]
        //                        0   1   2   3   4    5      6
        
        System.out.println( Arrays.toString(MyNumbers) );
    
        String result ="[";
        for(int i = MyNumbers.length-1; i  >= 0; i--) {
            
             result += MyNumbers[i] +", " ;
            
        }
                System.out.println();
                
        result = result.substring(0, result.length()-2)+"]"; 
                
                System.out.println(result);
    
          
          // Another way:
                
    int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
        Arrays.sort(arr2);  //  array will be sorted in Ascending order
    //  arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
        //        0  1   2    3   4    5     6
        
        int[] Decedning = new int[arr2.length];
        /*
            Decedning[0] = arr2[6];
            Decedning[1] = arr2[5];
            Decedning[2] = arr2[4];
            Decedning[3] = arr2[3];
            Decedning[4] = arr2[2];
            Decedning[5] = arr2[1];
            Decedning[6] = arr2[0];
        */
        
        int z=0;
        for(int i = arr2.length-1; i >=0; i-- ) {
            Decedning[ z ] = arr2[i];
            z++;
        }
        
        System.out.println( "Acsending order: "+ Arrays.toString(arr2));
    
        System.out.println("Descedning order: "+Arrays.toString(Decedning));
		
		

		}
	}


