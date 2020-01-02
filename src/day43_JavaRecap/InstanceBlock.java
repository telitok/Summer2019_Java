package day43_JavaRecap;

import java.util.Arrays;

public class InstanceBlock {
	
	String [] names = new String[3];
	
	{
		System.out.println("instance block");
		names[0] = "Alla";
		names[2] = "Seyfo";
		names[1] = "Khurshed";
		
		// names[3] = "Sukran";
	}
	
	public InstanceBlock() {  // default constructor
		System.out.println("Constructor");
		names[0] = "Rahwa";
		names[2] = "Gulmila";
		names[1] = "Esma";
		
	}
	
	public static void main(String[] args) {
		
		InstanceBlock obj = new InstanceBlock(); // we need to create an object to call the instance block.
		
		System.out.println("Main method");
		System.out.println(Arrays.toString(obj.names));
		
		InstanceBlock obj2 = new InstanceBlock();
	}

}
