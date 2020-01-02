package day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListParctice2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		           
		for(int i=0; i<=30;i++) {
			if(i%2!=0) {
			continue;
			}
			list.add(i);
		}
		System.out.println(list);
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		for(int each:list) {
			System.out.print(each+" ");
		}
		
		System.out.println();
		
		int num = list.get(7);  // unboxing, there is no primitives in arraylist
		System.out.println(num);
		
		// list.clear();
		// System.out.println(list);  // [] empty
		
		System.out.println(list.get(2));
		
		// sorting the arraylist:
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<Integer> list2 = new  ArrayList<>();
		
		for(int i=20;i>=0;i--) {
			list2.add(i);
		}
		     System.out.println(list2);
		     
		     Collections.sort(list2);
		
		
	}

}
