package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(100,100,100));
		
		System.out.println(list1);// [100,100,100]
		System.out.println(list1.get(0));
		
		
		
		Set<Integer> st1 = new HashSet<>();
		             st1.add(100);
		             st1.add(100);
		             st1.add(100);
	
		             System.out.println(st1);  // prints just one 100, because Set Interface does not accept duplicates
		   //        System.out.println(st1.get(0));  // Set does not have index numbers
		             
		System.out.println("=========================");
		
		Set<Integer> hashset = new HashSet<Integer>();
		      hashset.add(100);  // will not print this one, because does not take duplicates
		      hashset.add(10);
		      hashset.add(5);
		      hashset.add(4);
		      hashset.add(3);
		      hashset.add(1);
		      hashset.add(100);  
		      
		      System.out.println(hashset);  // HashSet does not keep the object order as it is
		      
		Set<Integer> linkedhashset = new LinkedHashSet<>();
			  linkedhashset.add(100);  
		      linkedhashset.add(10);
		      linkedhashset.add(5);
		      linkedhashset.add(4);
		      
		      System.out.println(linkedhashset);  // LinkedHashSet keeps the order of the objects as it is
		      // doubly-linked: add() & remove() are faster than the HashSet
		      
		      SortedSet<String> treeset = new TreeSet<>();
		             treeset.add("Z");
		             treeset.add("Y");
		             treeset.add("X");
		             treeset.add("W");
		             
		             System.out.println(treeset);
		             
		// Task: remove duplicates from an ArrayList and sort it
		             List<Integer> list = new ArrayList<>();
		             list.addAll(Arrays.asList(10,9,8,7,6));
		             Collections.sort(list);  // how to sort list. sorts but does not remove duplicates
		             System.out.println(list);
		             
		             
		             List<Integer> list2 = new ArrayList<>();
		             list2.addAll(Arrays.asList(10,9,8,7,6));
		             
		             TreeSet<Integer> ts = new TreeSet<>(list2);  // TreeSet sorts it, and removes the duplicates if there is any.
		             System.out.println(ts);
		             
		             
		/*
		 String = "AAAABBBCCCDDD";
		 Write a program that can remove the duplicates from String
		 */
		             
		             String str = "AAABBBCCCDDD";  // ABCD
		             String [] arr = str.split("");
		             System.out.println(Arrays.toString(arr));
		             
		             TreeSet<String> tr = new TreeSet<>(Arrays.asList(arr));
		             String result = tr.toString().replace(",","").replace("[", "").replace("]", "");
		             result = result.replace(" ","");
		             System.out.println(result);
		              
		             
		     // if we use LinkedHashSet instead of TreeSet, it would still remove the duplicates, however,
		     // it would not sort it
		             
           // second soluition
             String str2 =   new LinkedHashSet<String>(Arrays.asList(arr)).toString();
             System.out.println(str2);    
		        
	}

}
