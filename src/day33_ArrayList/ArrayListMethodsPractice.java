package day33_ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsPractice {
	
	public static void main(String[] args) {
		
		//set(index num, object):
		ArrayList<String> Javengers = new ArrayList<>();
		    Javengers.add("Jena");  // 0
		    Javengers.add("Mary");   // 1
		    Javengers.add("Tarah");  // 2
		    Javengers.add("Mahriban"); // 3
		    
		    Javengers.set(1, "Tugba");  // [Jena, Tugba, Tarah, Mahriban]
		    System.out.println(Javengers);
		    
		    Javengers.remove(0);
		    Javengers.add(0,"Pilot Nijat Borhan");
		    System.out.println(Javengers);
		    
		    
		// remove(): removes the index
		// remove(object): removes the first matching object and returns boolean value (true or false)
		    
		    ArrayList<Integer> numbers = new ArrayList<>();
		    numbers.add(1);
		    numbers.add(2);
		    numbers.add(3);
		    numbers.add(4);
		    numbers.add(5);
		    
		    numbers.remove(3);
		    System.out.println(numbers);
		    
		  // numbers.remove (Integer.parseInt("3"));   // parse method returns primitive to String value 
		    boolean result = numbers.remove(Integer.valueOf("3"));  // valueOf method returns Wrapper Class
		    System.out.println(numbers);
		
	}

}
