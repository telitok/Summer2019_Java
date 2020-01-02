package day43_JavaRecap;

import java.util.Arrays;
import java.util.ArrayList;

public class StaticBlock {
	
	static String [] arr = new String[3];
	static ArrayList<String> list = new ArrayList<>();
	double salary;
	
	static {
		System.out.println("static block");
		
		arr[2]="Ali";
		arr[0]="Sare";
		arr[1]="Tugba";
		
		list.addAll(Arrays.asList(arr));
		
		// salary = 5000;  gives error, because static accepts only static
		
		StaticBlock obj1 = new StaticBlock();
		obj1.salary=4000;
		System.out.println(obj1.salary);  // 4000.0
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		StaticBlock obj1 = new StaticBlock();
		System.out.println(obj1.salary);  // 0.0, because it is initialized as local variable within the main method
	}

}
