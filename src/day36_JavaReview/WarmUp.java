package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
	
	/*
	 WarmUp:
	 
    1. write a return method that can remove the duplicated objects from an Integer arraylist
    
    2. write a return method that can remove the duplicated objects from a String arraylist
    
    3. write a return method that can remove the duplicated objects from a Character arraylist
    
    4. write a return method that can remove the duplicated objects from a Double arraylist
	 */
	
	public static void main(String[] args) {
		// task 1:
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,5,6,6));
		System.out.println(list);
		list = RemoveDup(list);
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,4,5,5,6,6));
        System.out.println(list2);
        
            list2 = RemoveDup(list2);
            
            System.out.println(list2);
		
		// task 2:
		String [] names = {"Sherinay","Denis","Nurzat","Seyfo","Seyfo","Mehmet","Mehmet"};
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(names));
		System.out.println(list3);
		list3= RemoveDup2(list3);
		System.out.println(list3);
		
		
	}
	
	// task1:
	
	public static  ArrayList <Integer> RemoveDup(ArrayList<Integer> list){
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<list.size();i++) {
			if(!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
			
		}
		//Another way
		/*
		 for(Integer each : list) {
		 	if(!result.contains(each)) {
				result.add(each);
			}
		}
		 */
		return result;
	}
	
	// task 2:
	public static  ArrayList <String> RemoveDup2(ArrayList<String> list){
		ArrayList<String> result = new ArrayList<>();

		
		for(int i=0; i<list.size();i++) {
			if(!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
			
		}
		return result;
	}
}
