package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {
	
	/*
	 ArrayList methods: add(), get(), clear(), set(), size(), indexOf(),
	                    lastIndexOf(), equals(), isEmpty(), contains(),
	                    remove()Array.asList(), addAll(), removeAll(), sort()
	                    
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
	
   // add(object): takes an object
		list.add(10);    // auto boxing
		list.add(20);
		
	// add(index, object): it will insert given object at the given index.
		list.add(1,30);
		list.add(3,50);
		
		System.out.println(list);
		
		
	// get(index number): returns the object at the given index number.
		// get 50;
		System.out.println(list.get(3));
		
		// get 30;
		System.out.println(list.get(1));
		
		
	// size(): returns the total number of elements in the list. (Similar with length() method in Array.)
		System.out.println(list.size());  // 4
		   // last index number: list.size()-1
		
		 for(int i = 0; i < list.size(); i++) {
	            System.out.print(list.get(i)+" ");
	        }
	        
	        System.out.println();
	        
	    for(int i = list.size()-1;  i >= 0; i--  ) {
	        System.out.print(list.get(i)+" ");
	    }
	    System.out.println();
    
    
    // clear(): removes all object from arrayList, size will be 0
    
	    list.clear();
	    System.out.println(list);
    
    
    // set(0, Object): replaces the index with the given object
        ArrayList<String> students = new ArrayList<>();
            students.add("Erhan");
            students.add("Homayra");
            students.add("Rahwa");
            students.add("Arzu");
            students.add("Mehmet");
            students.add("Rahwa");
            
            System.out.println(students);
            
            students.set(0, "Holly");
            System.out.println(students);
            
            students.set(4, "Happy birthday Mehmed");
            System.out.println(students);
			
	// indexOf(object): returns the first matching object's index number.
			System.out.println(students.indexOf("Rahwa"));  // 2
				
				
	// lastIndexOf(object): return the last matching object's index number.
			System.out.println(students.lastIndexOf("Rahwa"));	
			
	// equals(): checks whether or not objects in two ArrayList are equal. Returns boolean value.		
	    ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A","B","C"));
	
		System.out.println(students.equals(students2));   // false
		
		students = students2;
		System.out.println(students.equals(students2));   // true
		
	
	// contains(object): checks if the given object is contained in the ArrayList. Returns boolean value.
	
	   System.out.println(students);
	   System.out.println(students.contains("Muhtar"));  // false
	   System.out.println(students.contains("Rahwa"));   // true
	   System.out.println(students.contains("Erhan"));  // false
	   
	   
	// isEmpty():checks if the size of the ArrayList is 0 or not, returns boolean value.
	   ArrayList<Character> ch = new ArrayList<>();
	   
	   System.out.println(ch.isEmpty());  // true
	   
	   
	 // remove(primitives int): removes the index numbers
	   ArrayList<Integer> price = new ArrayList<>();
	   price.add(1);  // 0
	   price.add(2);  // 1
	   price.add(3);  // 2
	   
	   price.remove(1);  // [1,3]
	   
	   System.out.println(price);
	  
	   
	 // removeAll(interface):
	   ArrayList<Integer> nums = new ArrayList<> (Arrays.asList(1,1,1,1,2,2,3,1));
	     nums.removeAll(Arrays.asList(1,2));
	   
	   /*
	    for(int i=0;i<nums.size();i++) {
	     if(nums.get(i)==1) {
			   nums.remove(i);
		   }
		   
	   }
	    */
		System.out.println(nums);  
	   
		
	  // addAll(Interface) = adds multiple objects to the ArrayList
		
		ArrayList<String> n1 = new ArrayList<>();
		n1.addAll(Arrays.asList("Yasin","Talha","Ruslan"));
		
		System.out.println(n1);
		
		
	  // Collections.sort(ArrayList): sorts the ArrayList in ascending order.
		Integer [] arr = {1,2,3,4,5,5,5,100,-100,-9};
		
		ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(arr));
		System.out.println(lists);
		
		Collections.sort(lists);
		System.out.println(lists);
		}

}
