package day40_staticKeyWord;

import java.util.Scanner;

public class staticKeyWord {
	
	/*
	 static: means that we can access the members through the class name.
	    static members belong to the class, also called class members.
	    
	    what can be static in java:
	            1. static variables
	            2. static methods
	            3. static initializer block
	            4. inner class (nested class)
	            
	   Static variables created in the class outside of any method.
	   When a variable is static, it is shared by class and all other objects of the class.
	   And we can call it through the class name.
	   
	 */
	
	int a;   // instance variable
	static int b;    // static variable
	static String name ;   // static variable
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		staticKeyWord obj1 = new staticKeyWord();
		obj1.a=100;
		
		staticKeyWord obj2 = new staticKeyWord();
		obj2.a = 200;
		
		
		System.out.println(obj1.a);  //100
		       // each object has its own copy of instance variables.
		
		double num = 100.5;
		
		obj1.b=900;
		
		System.out.println(staticKeyWord.b);  //900
		System.out.println(obj1.b);  // 900
		System.out.println(obj2.b);  //0
		
		System.out.println("====================================");
		
		staticKeyWord obj3 = new staticKeyWord();
		obj3.a = 100;
		
		staticKeyWord obj4 = new staticKeyWord();
		System.out.println(obj4.a);  // 0
		
		obj3.b = 400;
		System.out.println(obj3.b);  // 400
		
		System.out.println(obj4.b);  //400
		
		
	}
		
		public static void method1() {
			
			// System.out.println(num);    a local variable can be only called within the method
			
			int a = scan.nextInt();
	}
		public static void printHello() {
			
			int a = scan.nextInt();
			System.out.println("Hello Cybertek");
		}

}
