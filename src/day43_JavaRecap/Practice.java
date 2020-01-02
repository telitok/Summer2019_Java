package day43_JavaRecap;

import day43_JavaRecap.staticKeyword;

public class Practice {
	
	public static void main(String[] args) {
		
	
	
	staticKeyword.printName();  // Nurzat
	// static methods can be called through the class name
	
	
	// staticKeyword.printName2();
	// instance method cannot be called through the class name
	
	Practice.printName(); // Semra
	
	printName();
	
	staticKeyword obj=new staticKeyword();  // only way to call a non-static variable in static method.
	obj.printName2();                       // we must create an object
	
	}
	public static void printName() {
		System.out.println("Semra");
	}
}
