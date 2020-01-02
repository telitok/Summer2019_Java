package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		/*
		 Declaration of arrayList:
		   1. ArrayList<ClassType>variableName=new ArrayList<>();
		    
		   2. ArrayList<ClassType> variableName = new ArrayList<ClassType>();
		   
		   
		   Methods of ArrayList:
		   
		   1. add(value): adds values to ArrayList. If the value is primitive, will convert to wrapper class.
		   
		   2. get(indexnum): gets the specific value from tha arraylist.
		   
		   3. size(): returns the length (total number of values) from the arraylist.
		   
		   4. clear(): 		 
		   */
		int [] array1 = new int [3];
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		             list2.add(10);  // auto-boxing
		             list2.add(20);
		             list2.add(30);
		             
		System.out.println(list2);    // [10, 20, 30]
	                       // index num:  0   1   3
		
		System.out.println(list2.get(1));  // 20
		
		
		System.out.println(list2.size());   // 3
		
		list2.clear();
		
		System.out.println( list2 );
        
        System.out.println( list2.size() );

}
}