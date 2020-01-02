package day63_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsReview {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		    list1.addAll(Arrays.asList(100,100,100));
		    
		    System.out.println(list1);
		    
		Set<Integer> set1 = new HashSet<Integer>();
		   set1.add(100);
		   set1.add(100);
		   
		 System.out.println(set1);  // will print only one 100, because it does not accept duplicates
		
        
		ArrayList<Integer> arraylist = new ArrayList<>();
		      arraylist.add(1);
		      
		Vector<Integer> vector = new Vector<Integer>();
		   
		
		Stack<Integer> stack = new Stack<Integer>();
		    stack.add(100);
		    stack.add(200);
		    stack.add(300);
		    
		    System.out.println(stack.pop()); // prints 300
		    System.out.println(stack);  // prints 100,200.  => 300 is removed by pop() method.
		    
		    System.out.println(stack.pop());  // prints 200
		    System.out.println(stack);  // prints 100 only
		    
		    
		 int [][] arr2D = { {1,2,3} };
		    
		    ArrayList<Integer> l1 = new ArrayList<Integer>();
		    
		    ArrayList<ArrayList<Integer>> listOflist = new ArrayList<>();  // it is not multidimensional
		        // listOflist.add(1);
		      listOflist.add(l1);
		      
		      
		 Set<Integer> hashset = new HashSet<Integer>();
		       hashset.add(100);
		       hashset.add(90);
		       hashset.add(80);
		       hashset.add(70);
		       hashset.add(70);  // there will be only one 70, because HashSet does not accept duplicates
		       
		       System.out.println(hashset);  // will NOT print in order
		       
	     Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		       linkedHashSet.add(100);
		       linkedHashSet.add(90);
		       linkedHashSet.add(80);
		       linkedHashSet.add(70);
		       
		     System.out.println(linkedHashSet);
		     
		 List<Integer> lists = new ArrayList(Arrays.asList(10,9,8,7,6));
		 // Collections.sort(lists);
		 System.out.println(lists);
		     
		 SortedSet<Integer> sortedset = new TreeSet<Integer>(lists);
		 System.out.println(sortedset);
	}

}
