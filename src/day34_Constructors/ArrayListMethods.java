package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	
	/*
	 Remaining ArrayList Methods:
	 
	    indexOf(), lastIndexOf()
	    
	    Converting Array to ArrayList
	    
	    removeAll(), addAll();
	    
	    Arrays.asList(Object Array): used for converting object arrays to List Interface
	    
	        We will learn List Interface in future
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);  // auto boxing
		list.add(Integer.valueOf("33"));  // none
		list.add(Integer.parseInt("100"));  // auto boxing
		list.add(200);
		list.add(20);
		list.add(1);
		
		

		// indexOf(object): returns the index number of the given object from the arrayList 
        // if it returns negative number, it means the given object is not exist in the arraylist
       
       int a = list.indexOf( 11 );  // auto boxing
       System.out.println( a );   
       
       int a2 = list.indexOf(200);
       System.out.println(a2);  // when it prints -1 which means the object does not exist
       
       
       // lastindexOf(): returns the last occurred object's index number (last index number), returns int value
       
         int a3 = list.indexOf(1);
          int a4= list.lastIndexOf(1);
          System.out.println(a3);
          System.out.println(a4);
          
          
          
        // converting array to ArrayList:
          Integer [] arr = {1,2,3,4,5};
          
          ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));  // ArrayList
          list2.add(100);
          
          System.out.println(list2);
          
          String [] arr2= {"Java","Python","C#","C++"};
          ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr2));
          
          // checks whether or not the ArrayList is empty, adn returns a boolean expression
          System.out.println(list3.isEmpty());   // false
          System.out.println(list3);
          
          int [] arr3 = {1,2,3,4,5};
       //   ArrayList<Integer> list4 = new ArrayList<>(arr3);
               // only the object arrays can be converted
          
          
       // addAll(interface):
          String [] allnames = {"Sare Nil", "Ali Asaf", "Tugba","Harun"};
          ArrayList<String> names = new ArrayList<>();
             names.addAll(Arrays.asList("Almaz","Ibrohim","Tabi"));
             
             names.addAll(Arrays.asList(allnames));
             System.out.println(names);
            
             
       // ArrayList sorting:  Collections.sort();   ==> in the java.util package, so we need to import it.
             
             Integer [] array = {1000,900,80,765,123,542};
             
             ArrayList<Integer> price = new ArrayList<>();
                price.addAll(Arrays.asList(array));
                
                System.out.println(price);
                
             Collections.sort(price);
             System.out.println(price);
                
             
       
       
	}

}
